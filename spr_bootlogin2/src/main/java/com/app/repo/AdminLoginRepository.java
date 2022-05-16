package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.AdminLogin;

@Repository
public interface AdminLoginRepository extends JpaRepository< AdminLogin , Long> {
 public AdminLogin findUserByUname(String uname);
}