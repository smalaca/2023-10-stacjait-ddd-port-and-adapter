package com.smalaca.productmanagement.applicationcore.domain.assortment;

import com.smalaca.annotation.architecture.PrimaryPort;

import java.util.UUID;

public class Assortment {
    private UUID buyerId;

    @PrimaryPort
    public void addProduct(String productName) {

    }

    public UUID getBuyerId() {
        return buyerId;
    }
}
