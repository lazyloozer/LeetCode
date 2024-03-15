package com.example.shopnest.respositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopnest.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByEmail(String email);

}
