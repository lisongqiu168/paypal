package com.pc.payment.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by Piotr on 01.11.2016.
 */
public class AmountDetails {

    @JsonProperty("subtotal")
    private BigDecimal subtotal;
    @JsonProperty("tax")
    private BigDecimal tax;
    @JsonProperty("shipping")
    private BigDecimal shipping;
    @JsonProperty("handling_fee")
    private BigDecimal handlingFee;
    @JsonProperty("insurance")
    private BigDecimal insurance;
    @JsonProperty("shipping_discount")
    private BigDecimal shippingDiscount;


    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(BigDecimal handlingFee) {
        this.handlingFee = handlingFee;
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public BigDecimal getShippingDiscount() {
        return shippingDiscount;
    }

    public void setShippingDiscount(BigDecimal shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
    }
}
