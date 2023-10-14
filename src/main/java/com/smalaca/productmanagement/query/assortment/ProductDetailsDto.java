package com.smalaca.productmanagement.query.assortment;

import java.math.BigDecimal;
import java.util.UUID;

// Odczyt z tabeli: PRODUCTS
public class ProductDetailsDto {
    private UUID productId;
    private String productName;
    private BigDecimal price;
    private String serialNumber;

    public UUID productId() {
        return productId;
    }

    public String productName() {
        return productName;
    }

    public BigDecimal price() {
        return price;
    }

    public String serialNumber() {
        return serialNumber;
    }
}
