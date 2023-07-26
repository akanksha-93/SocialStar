package com.dreamproject.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.AbstractLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SocialStarConfig {

    private static final Logger LOG = LoggerFactory.getLogger(SocialStarConfig.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
           // ResponseEntity<String> obj = restTemplate.getForEntity(
            //        "http://localhost:8080/check2", String.class);
           /* ResponseEntity<String> obj = restTemplate.getForEntity(
                    "https://www.facebook.com/v17.0/dialog/oauth?\n" +
                            "  client_id={1211816522793104}\n" +
                            "  &redirect_uri={\"https://localhost:8080/login\"}\n" +
                            "  &state={\"{st=state123abc,ds=123456789}\"}" +
                            "  &response_type=token", String.class);

            */
           // LOG.info(obj.getBody());
        };
    }
}
