package com.smalaca.productmanagement.applicationcore.domain.assortment;

import com.smalaca.annotation.ddd.DomainEntity;

@DomainEntity
class Product {
    private final String productName;

    Product(String productName) {
        this.productName = productName;
    }

    boolean hasName(String productName) {
        return this.productName.equals(productName);
    }
}
