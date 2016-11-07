package com.pc.payment.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by Piotr on 01.11.2016.
 */
public class Item {

    @JsonProperty("name")
    private String name;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("description")
    private String description;
    @JsonProperty("tax")
    private BigDecimal tax;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }
}
