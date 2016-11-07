package com.pc.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

/**
 * Created by Piotr on 24.10.2016.
 */

@Service
public class TokenService {

    private final RestTemplate restTemplate;

    @Value("${paypal.clientId}")
    private String clientId;
    @Value("${paypal.secret}")
    private String secret;

    public TokenService() {
        restTemplate = new RestTemplate();
    }

    public AccessTokenResponse getAccessToken() {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + getCredentialInBase64());
        headers.add(HttpHeaders.ACCEPT, "application/json");
        headers.add(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
        String payload = "grant_type=client_credentials";
        HttpEntity<String> request = new HttpEntity<String>(payload, headers);

        ResponseEntity<AccessTokenResponse> response = restTemplate.postForEntity("https://api.sandbox.paypal.com/v1/oauth2/token", request, AccessTokenResponse.class);

        return response.getBody();
    }

    private String getCredentialInBase64() {
        String plainCreds = String.format("%s:%s", clientId, secret);
        byte[] base64CredsBytes = Base64.getEncoder().encode(plainCreds.getBytes());
        return new String(base64CredsBytes);
    }
}
