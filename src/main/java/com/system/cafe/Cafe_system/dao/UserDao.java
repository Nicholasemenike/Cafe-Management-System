package com.system.cafe.Cafe_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.system.cafe.Cafe_system.POJO.User;

public interface UserDao extends JpaRepository<User, Integer>{
    
    User findByEmailId(@Param("email") String email);
}
