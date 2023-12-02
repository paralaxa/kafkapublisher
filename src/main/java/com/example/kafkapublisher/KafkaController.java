package com.example.kafkapublisher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class KafkaController {

  @GetMapping("/kafka/publish/{topic}")
  public void publish(@PathVariable("topic") String topic,
      Authentication authentication) {
    log.info("Publishing into kafka :{}", topic);
  }

}

