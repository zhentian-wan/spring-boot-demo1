package com.globomatisc.bike.models;

import java.math.BigDecimal;
import java.util.Date;

public class bike {
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal puchasePrice;
    private Date purchaseDate;
    private boolean contact;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getPuchasePrice() {
        return puchasePrice;
    }

    public void setPuchasePrice(BigDecimal puchasePrice) {
        this.puchasePrice = puchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean isContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
