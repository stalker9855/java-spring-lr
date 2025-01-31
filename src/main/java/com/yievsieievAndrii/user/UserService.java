package com.yievsieievAndrii.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService  {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(Long id) {
    return userRepository.findById(id);
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public boolean deleteUser(Long id) {
    return userRepository.deleteById(id);
  }

}
