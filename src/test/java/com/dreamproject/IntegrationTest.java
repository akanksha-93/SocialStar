package com.dreamproject;

import com.dreamproject.facebook.service.FacebookLoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;


public class IntegrationTest {

    RestTemplate restTemplate = new RestTemplate();
    FacebookLoginService facebookLoginService;

    @BeforeEach
    public void init(){
        facebookLoginService = new FacebookLoginService(restTemplate);
    }

    @Test
    public void testFetchToken(){
        Assert.notNull(facebookLoginService.getLoginToken(),"Login access token failed to be fetched");
    }
}
