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
    public User createUser(User user) throws Exception {
        user.setUsername(Long.toString(user.getMember().getMemberID()));
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            System.out.println(userRepository.findByUsername(user.getUsername()));
            throw Exceptions.UserAlreadyExists;
        }
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
        User userFromDB = userRepository.findById(id).get();
        user.setCreatedAt(userFromDB.getCreatedAt());
        return userRepository.save(user);
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

    public void resetPassword(Long id) throws Exception {
        User user = userRepository.findById(id).get();
        user.setPassword(bCryptPasswordEncoder.encode("password"));
        userRepository.save(user);
    }
}
