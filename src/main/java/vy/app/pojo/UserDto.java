package vy.app.pojo;

import vy.app.model.Role;

import java.util.Date;
import java.util.Set;

public class UserDto {
  private int userID;
  private int memberID;
  private String username;
  private String password;
  private String status;
  private boolean trash;
  private Date createDate;
  private Date updateDate;
  private Set<Role> roles;


  public int getUserID() {
    return userID;
  }

  public void setUserID(int userID) {
    this.userID = userID;
  }

  public int getMemberID() {
    return memberID;
  }

  public void setMemberID(int memberID) {
    this.memberID = memberID;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean isTrash() {
    return trash;
  }

  public void setTrash(boolean trash) {
    this.trash = trash;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }


  @Override
  public String toString() {
    return "UserDto{" +
      "userID=" + userID +
      ", memberID=" + memberID +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", status='" + status + '\'' +
      ", trash=" + trash +
      ", createDate=" + createDate +
      ", updateDate=" + updateDate +
      '}';
  }
}
