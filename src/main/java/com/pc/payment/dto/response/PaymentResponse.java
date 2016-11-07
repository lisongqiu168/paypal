package com.pc.payment.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Piotr on 26.10.2016.
 */
public class PaymentResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("create_time")
    private String createdTime;
    @JsonProperty("update_time")
    private String updateTime;
    @JsonProperty("state")
    private String state;
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("payer")
    private Payer payer;
    @JsonProperty("transactions")
    private List<Amount> transactions;
    @JsonProperty("description")
    private String description;
    @JsonProperty("custom")
    private String custom;
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    @JsonProperty("items")
    private List<Item> items;
    @JsonProperty("links")
    private List<Link> links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public List<Amount> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Amount> transactions) {
        this.transactions = transactions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
