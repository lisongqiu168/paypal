package com.pc.payment;

import com.pc.payment.dto.response.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Piotr on 26.10.2016.
 */
@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @RequestMapping(value = "/payment", method = RequestMethod.GET)
    public String payment() {
        return "payment";
    }


    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public String createPayment() {
        PaymentResponse payment = paymentService.createPayment(null);
        String redirect = getRedirect(payment);
        return "redirect:" + redirect;
    }

    private String getRedirect(PaymentResponse response) {
        return response.getLinks().stream().filter(link -> link.getMethod().equals("REDIRECT")).findFirst().get().getHref();
    }

}
