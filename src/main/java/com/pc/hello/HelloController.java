package com.pc.hello;

import com.pc.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private TokenService tokenService;

    @RequestMapping("/")
    public String index() {
        String token = tokenService.getAccessToken().getAccessToken();
        return "Greetings from Spring Boot! token:" + token;
    }

}
