package com.pc.payment.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Piotr on 01.11.2016.
 */
public class Link {

    @JsonProperty("href")
    private String href;
    @JsonProperty("self")
    private String rel;
    @JsonProperty("method")
    private String method;


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
