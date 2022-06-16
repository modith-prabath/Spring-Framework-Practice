package com.spring.framework.practice.springmvcdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.framework.practice.springmvcdemo.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}


