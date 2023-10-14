package com.smalaca.purchase.applicationcore.application.cart;

import com.smalaca.annotation.architecture.PrimaryAdapter;
import com.smalaca.purchase.applicationcore.domain.cart.Cart;
import com.smalaca.purchase.applicationcore.domain.cart.CartRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class CartApplicationService {
    private final CartRepository cartRepository;

    public CartApplicationService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @PrimaryAdapter
    @Transactional
    public void addProduct(UUID cartId, UUID productId) {
        Cart cart = cartRepository.findBy(cartId);

        cart.addProduct(productId);

        cartRepository.save(cart);
    }
}
