package vy.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vy.app.Util.JwtUtils;
import vy.app.pojo.AuthenticationRequest;
import vy.app.pojo.AuthenticationResponse;
import vy.app.pojo.UserDto;
import vy.app.service.UserService;
import vy.app.service.VyUserDetailsService;

@RestController
public class UserController {

  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  JwtUtils jwtUtils;

  @Autowired
  UserService userService;

  @RequestMapping("/hello")
  public String hello(){
    return "Hello world";
  }

  @RequestMapping(value = "/authenticate", method = RequestMethod.POST )
  public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest authenticationRequest){
 try {
   System.out.println(authenticationRequest.getPassword());
   System.out.println("$$$$$$$$$$$$$$$$$$$$$");
    Authentication authentication =authenticationManager.authenticate(
      new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
    );
   System.out.println(authentication.getCredentials());

  }catch (BadCredentialsException e){
   e.printStackTrace();
  }catch (Exception e){
   System.out.println("Another Exception : "+ e);
 }

    final String jwt = "";//jwtUtils.generateToken(userDetails);

    return ResponseEntity.ok(new AuthenticationResponse(jwt));
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public void registerUser(@RequestBody UserDto userDto){
    System.out.println(userDto);
    userService.registerUser(userDto);
  }
}
