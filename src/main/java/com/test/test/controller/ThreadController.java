package com.test.test.controller;

import com.test.test.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class ThreadController {
  private final ThreadService threadService;

  @PostMapping
  public ResponseEntity<String> test() {
    return new ResponseEntity<>(threadService.postTest(), HttpStatus.CREATED);
  }
}
