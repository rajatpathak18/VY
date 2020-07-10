package vy.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import vy.app.model.User;
import vy.app.pojo.AuthenticationRequest;
import vy.app.pojo.AuthenticationResponse;
import vy.app.pojo.UserDto;
import vy.app.security.JwtUtils;
import vy.app.security.VyUserDetails;
import vy.app.util.Converter;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private Converter converter;

    @PostMapping(value = "/authenticate/")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        AuthenticationResponse authenticationResponse = null;
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
            VyUserDetails userDetails = (VyUserDetails) authentication.getPrincipal();
            String jwt = jwtUtils.generateToken(userDetails);
            authenticationResponse = new AuthenticationResponse(jwt, converter.convertToDto(userDetails.getUser()), userDetails.getAuthorities());

            return new ResponseEntity<>(authenticationResponse, HttpStatus.OK);
        } catch (BadCredentialsException e) {
            System.out.println("Bad Credentials Exception " + e);
            return new ResponseEntity<>(authenticationResponse, HttpStatus.UNAUTHORIZED);
        } catch (Exception e) {
            System.out.println("Another Exception : " + e);
            return new ResponseEntity<>(authenticationResponse, HttpStatus.UNAUTHORIZED);
        }
    }
}
