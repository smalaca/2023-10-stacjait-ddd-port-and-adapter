package com.smalaca.productmanagement.command.domain.assortment;

import com.smalaca.annotation.ddd.DomainEntity;

import java.util.UUID;

@DomainEntity
// Zapis w tabeli: PRODUCTS
class Product {
    private UUID productId;
    private final String productName;
//    private Price price;
//    private SerialNumber serialNumber;

    Product(String productName) {
        this.productName = productName;
    }

    boolean hasName(String productName) {
        return this.productName.equals(productName);
    }
}
