package com.joeljebitto.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
  // This is a placeholder for the REST controller logic.
  // You can define your endpoints here using Spring's @GetMapping, @PostMapping,
  // etc.

  // Example:
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello, World!!";
  }

}
