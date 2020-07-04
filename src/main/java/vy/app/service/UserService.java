package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

//    private final PasswordEncoder passwordEncoder;

    @Transactional
    public User createUser(User user) {
        user.setUsername(Integer.toString(user.getMember().getMemberID()));
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPassword("password");
        return userRepository.findById(userRepository.save(user).getUserID()).get();
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }

    @Transactional
    public User updateUser(int id, User user) {
        userRepository.save(user);
        return userRepository.findById(id).get();
    }

    @Transactional
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
