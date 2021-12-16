package com.example.spring.sharding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dingyu
 * @date 2021-12-15 19:10
 */
@RestController
public class ServiceController {

  @GetMapping("/health/check")
  public String health() {
    return "ok";
  }
}
