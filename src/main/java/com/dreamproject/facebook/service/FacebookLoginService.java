package com.dreamproject.facebook.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FacebookLoginService {

    private static final Logger LOG = LoggerFactory.getLogger(FacebookLoginService.class);

    public RestTemplate restTemplate;

    public FacebookLoginService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    public String getLoginToken() {

        String clientId = "1211816522793104";
        String clientSecret = "271a8715297bb4f7aa7b455712ab4fc4";

        ResponseEntity<String> obj = restTemplate.getForEntity(
                "https://graph.facebook.com/oauth/access_token?" +
                        "client_id=" + clientId +
                        "&client_secret=" + clientSecret +
                        "&grant_type=client_credentials",
                String.class);
        LOG.info(obj.getBody());
        return obj.getBody();

    }
}
