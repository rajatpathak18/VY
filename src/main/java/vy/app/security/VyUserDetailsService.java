package vy.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vy.app.model.User;
import vy.app.repository.UserRepository;
import vy.app.security.VyUserDetails;

import java.util.Optional;

@Service
public class VyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("inside load user");
        UserDetails userDetails;

        Optional<User> user = userRepository.findByUsername(username);
        userDetails = new VyUserDetails(user.get());
        if (user.isPresent()) {
            return userDetails;
        } else {
            throw new UsernameNotFoundException("Username doesn't exist. Please register");
        }
    }

}
//$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG
