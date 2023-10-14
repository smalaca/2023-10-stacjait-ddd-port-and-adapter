package com.smalaca.purchase.applicationcore.domain.cart;

import com.smalaca.annotation.architecture.PrimaryPort;
import com.smalaca.purchase.applicationcore.domain.offer.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Cart {
    private UUID cartId;
    private final List<CartItem> items = new ArrayList<>();

    @PrimaryPort
    public void addProduct(UUID productId, Amount amount) {
        Optional<CartItem> found = findFor(productId);

        if (found.isPresent()) {
            found.get().add(amount);
        } else {
            items.add(new CartItem(productId, amount));
        }
    }

    @PrimaryPort
    public void removeProduct(UUID productId, Amount amount) {
        Optional<CartItem> found = findFor(productId);

        if (found.isEmpty()) {
            throw CartException.productNotInTheCart(productId);
        }

        removeProduct(found.get(), amount);
    }

    private Optional<CartItem> findFor(UUID productId) {
        return items.stream()
                .filter(cartItem -> cartItem.isFor(productId))
                .findAny();
    }

    private void removeProduct(CartItem cartItem, Amount amount) {
        if (cartItem.hasNotMoreThan(amount)) {
            items.remove(cartItem);
        } else {
            cartItem.decrease(amount);
        }
    }

    public UUID getCartId() {
        return cartId;
    }

    @PrimaryPort
    public Offer accept() {
        return new Offer();
    }
}
