package com.smalaca.purchase.infrastructure.repository.inmemory.cart;

import com.smalaca.purchase.applicationcore.domain.cart.Cart;
import com.smalaca.purchase.applicationcore.domain.cart.CartRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryCartRepository implements CartRepository {
    private final Map<UUID, Cart> carts = new HashMap<>();

    @Override
    public Cart findBy(UUID cartId) {
        return carts.get(cartId);
    }

    @Override
    public void save(Cart cart) {
        carts.put(cart.getCartId(), cart);
    }
}
