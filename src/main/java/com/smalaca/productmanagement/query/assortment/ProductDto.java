package com.smalaca.productmanagement.query.assortment;

import java.util.UUID;

// Odczyt z tabeli: PRODUCTS
public class ProductDto {
    private UUID productId;
    private String productName;

    public UUID productId() {
        return productId;
    }

    public String productName() {
        return productName;
    }
}
