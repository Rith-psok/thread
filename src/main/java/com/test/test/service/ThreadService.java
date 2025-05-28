package com.test.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ThreadService {
  private final EmailService emailService;

  public String postTest() {
    List<CompletableFuture<String>> futures = new ArrayList<>();
    for (var i = 0; i < 100; i++) {
      futures.add(emailService.sendEmail((long) i, "test", "test content"));
      log.info("============================================================================");
    }

    CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
    return "test";
  }
}
