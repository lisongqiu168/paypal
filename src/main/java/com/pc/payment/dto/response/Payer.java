package com.pc.payment.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Piotr on 28.10.2016.
 */
public class Payer {

    @JsonProperty("payment_method")
    private String paymentMethod;


    public Payer() {
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
