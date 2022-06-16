package com.spring.framework.practice.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.framework.practice.springmvcdemo.Repository.UserRepository;
import com.spring.framework.practice.springmvcdemo.model.User;

@Controller
public class UserController {

  UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping("/register")
  public String userRegister(@ModelAttribute User user) {

    System.out.println(user.toString());

    userRepository.save(user);
    return "RegisterSuccess";

  }

  @PostMapping("/display")
  public String userDisplay( Model model) {

     model.addAttribute("users", userRepository.findAll());
    return "UserRegister";

  }
}
