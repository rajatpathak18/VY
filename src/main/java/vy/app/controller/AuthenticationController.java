package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import vy.app.Exception.Exceptions;
import vy.app.pojo.AuthenticationErrorResponse;
import vy.app.pojo.AuthenticationRequest;
import vy.app.pojo.AuthenticationResponse;
import vy.app.security.JwtUtils;
import vy.app.security.VyUserDetails;
import vy.app.util.UserConverter;

import java.util.NoSuchElementException;

@Log4j2
@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private UserConverter converter;

    @PostMapping(value = "/authenticate/")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        AuthenticationResponse authenticationResponse = null;
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
            VyUserDetails userDetails = (VyUserDetails) authentication.getPrincipal();
            String jwt = jwtUtils.generateToken(userDetails);
            authenticationResponse = new AuthenticationResponse(jwt, converter.convertToDto(userDetails.getUser()), userDetails.getAuthorities());
            log.info("login for username " + authenticationRequest.getUsername() + " is successful");
            return new ResponseEntity<>(authenticationResponse, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(" Exception in authentication" + e.getLocalizedMessage());
            throw Exceptions.BadCredentialException;
        }
    }
}
