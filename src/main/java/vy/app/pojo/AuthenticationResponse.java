package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Getter
@Setter
public class AuthenticationResponse {
    private String accessToken;
    private UserDto user;
    private Collection<? extends GrantedAuthority> authorities;

    AuthenticationResponse() {
    }

    public AuthenticationResponse(String accessToken, UserDto userDto, Collection<? extends GrantedAuthority> authorities) {
        this.accessToken = accessToken;
        this.user = userDto;
        this.authorities = authorities;
    }
}
