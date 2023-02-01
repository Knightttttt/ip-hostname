package io.ipgeolocation.iphostnamecrawlermaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IpHostnameCrawlerMasterApplication {

  public static void main(String[] args) {
    SpringApplication.run(IpHostnameCrawlerMasterApplication.class, args);
  }

}
