package com.AdvJavaProject.FoodOrdering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String helloWorld() {
    return "Hello World";
  }
}
