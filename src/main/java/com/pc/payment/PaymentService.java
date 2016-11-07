package com.pc.payment;


import com.pc.payment.dto.request.PaymentRequest;
import com.pc.payment.dto.response.PaymentResponse;
import com.pc.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Piotr on 26.10.2016.
 */
@Service
public class PaymentService {

    @Autowired
    private TokenService tokenService;

    private RestTemplate restTemplate = new RestTemplate();


    public PaymentResponse createPayment(PaymentRequest request) {
        String accessToken = tokenService.getAccessToken().getAccessToken();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + accessToken);
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json");
        String payload = getSampleRequest();
        HttpEntity<String> httpEntity = new HttpEntity<String>(payload, headers);

        ResponseEntity<PaymentResponse> stringResponseEntity = restTemplate.postForEntity("https://api.sandbox.paypal.com/v1/payments/payment", httpEntity, PaymentResponse.class);
        return stringResponseEntity.getBody();
    }

    private String getSampleRequest() {
        return "{" +
                "  \"intent\": \"sale\"," +
                "  \"redirect_urls\":" +
                "  {" +
                "    \"return_url\": \"http://return_URL_here\"," +
                "    \"cancel_url\": \"http://cancel_URL_here\"" +
                "  }," +
                "  \"payer\":" +
                "  {" +
                "    \"payment_method\": \"paypal\"" +
                "  }," +
                "  \"transactions\": [" +
                "  {" +
                "    \"amount\":" +
                "    {" +
                "      \"total\": \"7.47\"," +
                "      \"currency\": \"USD\"" +
                "    }," +
                "    \"description\": \"This is the payment transaction description.\"" +
                "  }]" +
                "}";


    }

}
