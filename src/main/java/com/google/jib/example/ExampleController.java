package com.google.jib.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("api/example")
public class ExampleController {
  @GetMapping("{name}")
  public ResponseEntity get(@PathVariable String name) {
    return ResponseEntity.ok("Hi " + name + " you called me at " + new Date().toString());
  }
}
