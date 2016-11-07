package com.pc.payment.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by Piotr on 28.10.2016.
 */
public class Amount {

    @JsonProperty("total")
    private BigDecimal total;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("details")
    private AmountDetails amountDetails;

    public Amount() {
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
