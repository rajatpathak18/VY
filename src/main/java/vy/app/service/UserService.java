package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vy.app.Exception.APIException;
import vy.app.Exception.Exceptions;
import vy.app.model.User;
import vy.app.model.User;
import vy.app.repository.UserRepository;
import vy.app.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public User createUser(User user) {
        user.setUsername(Long.toString(user.getMember().getMemberID()));
        user.setPassword(bCryptPasswordEncoder.encode("password"));
        return userRepository.findById(userRepository.save(user).getUserID()).get();
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }

    @Transactional
    public User updateUser(Long id, User user) {
        userRepository.save(user);
        return userRepository.findById(id).get();
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void changePassword(Long id, String oldPassword, String newPassword) throws Exception {
        User user = userRepository.findById(id).get();
        if (!bCryptPasswordEncoder.matches(oldPassword, user.getPassword())) {
            throw Exceptions.UserIncorrectOldPasswordException;
        }
        user.setPassword(bCryptPasswordEncoder.encode(newPassword));
        userRepository.save(user);
    }
}
