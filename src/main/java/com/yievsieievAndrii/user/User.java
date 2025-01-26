
package com.yievsieievAndrii.user;

public class User {

  private Long id;

  private static Long incrementId = 1L;

  private String username;

  private String email;

  private String password;

  public User(String username, String email, String password) {
    this.id = User.incrementId++;
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


}
