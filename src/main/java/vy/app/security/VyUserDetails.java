package vy.app.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import vy.app.model.Role;
import vy.app.model.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class VyUserDetails implements UserDetails {

  private User user;
  private Collection<? extends GrantedAuthority> authorities;

  public VyUserDetails(User user){
    this.user = user;
    String[] permissions = user.getRoles().stream().flatMap(role -> role.getPermissions().stream()).map(permission -> permission.getName())
      .toArray(String[]::new);
    this.authorities = AuthorityUtils.createAuthorityList(permissions);
  }

  VyUserDetails(){
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.authorities;
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
