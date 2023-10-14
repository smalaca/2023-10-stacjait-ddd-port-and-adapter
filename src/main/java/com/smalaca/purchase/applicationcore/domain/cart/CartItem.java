package com.smalaca.purchase.applicationcore.domain.cart;

import com.smalaca.annotation.ddd.DomainEntity;

import java.util.UUID;

@DomainEntity
class CartItem {
    private final UUID productId;
    private Amount amount;

    CartItem(UUID productId, Amount amount) {
        this.productId = productId;
        this.amount = amount;
    }

    void add(Amount amount) {
        this.amount = this.amount.add(amount);
    }

    boolean isFor(UUID productId) {
        return this.productId.equals(productId);
    }

    boolean hasNotMoreThan(Amount amount) {
        return this.amount.hasNotMoreThan(amount);
    }

    void decrease(Amount amount) {
        this.amount = this.amount.decrease(amount);
    }
}
