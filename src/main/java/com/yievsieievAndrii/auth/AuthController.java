package com.yievsieievAndrii.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private AuthService authService;

  @PostMapping("/register")
  public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
    authService.registerUser(request);
    return new ResponseEntity<>("User registered succesfully!", HttpStatus.CREATED);
  }

  // @PostMapping("/login")
  // public ResponseEntity<AuthResponse> loginUser(@RequestBody AuthRequest
  // request) {
  // String token = authService.login(request);
  // return ResponseEntity.ok(new AuthResponse(token));
  // }

}
