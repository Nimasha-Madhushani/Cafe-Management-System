package com.example.CafeManagementSystemBackend.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {
    ResponseEntity<String>signUp(Map<String,String>requestMap);
}
