package com.smalaca.purchase.applicationcore.domain.offer;

import com.smalaca.annotation.architecture.PrimaryPort;
import com.smalaca.purchase.applicationcore.domain.order.Order;

import java.util.UUID;

public class Offer {
    private final UUID cartId;
    private UUID offerId;

    public Offer(UUID cartId) {
        this.cartId = cartId;
    }

    public UUID getOfferId() {
        return offerId;
    }

    @PrimaryPort
    public Order accept() {
        return new Order();
    }
}
