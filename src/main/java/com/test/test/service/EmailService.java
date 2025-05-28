package com.test.test.service;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {

  @Async
  public CompletableFuture<String> sendEmail(Long to, String subject, String content) {
    // Simulate long-running task (e.g., sending email)
    log.info("Sending email {} on thread: {}", to, Thread.currentThread().getName());
    return CompletableFuture.completedFuture("Email sent: " + to + Date.from(Instant.now()));
  }
}
