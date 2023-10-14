package com.smalaca.purchase.applicationcore.domain.cart;

import com.smalaca.annotation.architecture.PrimaryPort;
import com.smalaca.purchase.applicationcore.domain.offer.Offer;

import java.util.UUID;

public class Cart {
    private UUID cartId;

    @PrimaryPort
    public void addProduct(UUID productId) {

    }

    public UUID getCartId() {
        return cartId;
    }

    @PrimaryPort
    public Offer accept() {
        return new Offer();
    }
}
