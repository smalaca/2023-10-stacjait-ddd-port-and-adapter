package com.smalaca.purchase.applicationcore.domain.offer;

import com.smalaca.annotation.architecture.PrimaryPort;
import com.smalaca.purchase.applicationcore.domain.order.Order;

import java.util.UUID;

public class Offer {
    private UUID offerId;

    public UUID getOfferId() {
        return offerId;
    }

    @PrimaryPort
    public Order accept() {
        return new Order();
    }
}
