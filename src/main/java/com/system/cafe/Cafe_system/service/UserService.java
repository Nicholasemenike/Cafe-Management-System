package com.system.cafe.Cafe_system.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<String> signUp(Map<String, String> requestMap);
    
}
