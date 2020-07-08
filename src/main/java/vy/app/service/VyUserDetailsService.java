package vy.app.service;

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
      if(user.isPresent()) {
        userDetails = new VyUserDetails(user.get());
        System.out.println("password from db ***********>>>>>>>>>>>");
        System.out.println(userDetails.getPassword());
        return userDetails;
      }else{
        throw new UsernameNotFoundException("Username doesn't exist. Please register");
      }
  }

}
