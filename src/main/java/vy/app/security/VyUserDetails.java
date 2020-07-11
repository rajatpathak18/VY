package vy.app.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import vy.app.model.User;

import java.util.Collection;

public class VyUserDetails implements UserDetails {

    @Getter
    private User user;
    @Getter
    private Collection<? extends GrantedAuthority> authorities;

    public VyUserDetails(User user) {
        this.user = user;
        String[] permissions = user.getRoles().stream().flatMap(role -> role.getPermissions().stream()).map(permission -> permission.getName())
                .toArray(String[]::new);
        this.authorities = AuthorityUtils.createAuthorityList(permissions);
    }

    VyUserDetails() {
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

