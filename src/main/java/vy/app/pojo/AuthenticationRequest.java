package vy.app.pojo;

import java.sql.Date;

public class AuthenticationRequest {

    private String username;
    private String password;

  public AuthenticationRequest() {
  }

  public AuthenticationRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  /**
 private int userID;
 private int memberID;
 private String username;
 private String password;
 private String status;
 private boolean trash;
 private Date createDate;
 private Date updateDate;
 **/
}
