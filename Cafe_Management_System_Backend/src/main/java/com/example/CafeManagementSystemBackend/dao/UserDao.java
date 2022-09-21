package com.example.CafeManagementSystemBackend.dao;

import com.example.CafeManagementSystemBackend.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
