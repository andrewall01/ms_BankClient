package com.project.ms.client.application.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Class of configutarion WebClient.
 * 
 * @author allontop
 * 
 */

@Configuration
public class WebClientConfig {

  @Bean
  @LoadBalanced
  public WebClient.Builder getWebClient() {
    return WebClient.builder();
  }

}
