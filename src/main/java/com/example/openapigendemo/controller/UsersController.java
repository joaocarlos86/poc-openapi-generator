package com.example.openapigendemo.controller;

import org.openapitools.api.UsersApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UsersController implements UsersApi {

  @Override
  public ResponseEntity<List<String>> usersGet() {
    return ResponseEntity.ok(Arrays.asList("Joao", "Carlos"));
  }
}
