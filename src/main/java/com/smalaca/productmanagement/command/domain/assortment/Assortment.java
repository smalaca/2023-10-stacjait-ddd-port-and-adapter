package com.smalaca.productmanagement.command.domain.assortment;

import com.smalaca.annotation.architecture.PrimaryPort;
import com.smalaca.annotation.ddd.AggregateRoot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AggregateRoot
public class Assortment {
    private UUID buyerId;
    private List<Product> products = new ArrayList<>();

    @PrimaryPort
    public void addProduct(String productName) {
        if (alreadyHas(productName)) {
            throw AssortmentException.productAlreadyExists(productName);
        }

        products.add(new Product(productName));
    }

    private boolean alreadyHas(String productName) {
        return products.stream()
                .anyMatch(product -> product.hasName(productName));
    }

    public UUID getBuyerId() {
        return buyerId;
    }
}
