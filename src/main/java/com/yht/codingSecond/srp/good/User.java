package com.yht.codingSecond.srp.good;

import java.util.List;

public class User {

    private String name;
    private String emailAddress;

    private List<Product> subscribedProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Product> getSubscribedProducts() {
        return subscribedProducts;
    }

    public void setSubscribedProducts(List<Product> subscribedProducts) {
        this.subscribedProducts = subscribedProducts;
    }
}
