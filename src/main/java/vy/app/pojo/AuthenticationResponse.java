package vy.app.pojo;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class AuthenticationResponse {
    private String jwt;
    private UserDto userDto;
    private Collection<? extends GrantedAuthority> authorities;

    AuthenticationResponse() {
    }

    public AuthenticationResponse(String jwt, UserDto userDto, Collection<? extends GrantedAuthority> authorities) {
        this.jwt = jwt;
        this.userDto = userDto;
        this.authorities = authorities;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
