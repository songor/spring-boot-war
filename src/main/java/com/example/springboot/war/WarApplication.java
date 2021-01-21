package com.example.springboot.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chensongyu
 */
@RestController
@SpringBootApplication
public class WarApplication extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(WarApplication.class, args);
  }

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }
}
