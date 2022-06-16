package com.spring.framework.practice.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.framework.practice.springmvcdemo.model.User;

@Controller
public class HelloWorldController {



  @RequestMapping("/")
  public String demo(){
    return "Demo";
  }

  @RequestMapping("/hello")
  public String helloWorld() {
    return "HelloWorld";
  }



  @RequestMapping( "/helloformweb" )
  public String helloWorldform () {

    return "HelloWorldfname";


  }

 





  
}
