package com.smalaca.purchase.applicationcore.domain.cart;

import com.smalaca.annotation.architecture.SecondaryPort;

import java.util.UUID;

@SecondaryPort
public interface CartRepository {
    Cart findBy(UUID cartId);

    void save(Cart cart);
}
