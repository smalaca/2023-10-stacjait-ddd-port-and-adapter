package com.smalaca.purchase.applicationcore.application.cart;

import com.smalaca.annotation.architecture.PrimaryAdapter;
import com.smalaca.purchase.applicationcore.domain.cart.Cart;
import com.smalaca.purchase.applicationcore.domain.cart.CartRepository;
import com.smalaca.purchase.applicationcore.domain.offer.Offer;
import com.smalaca.purchase.applicationcore.domain.offer.OfferRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class CartApplicationService {
    private final CartRepository cartRepository;
    private final OfferRepository offerRepository;

    public CartApplicationService(CartRepository cartRepository, OfferRepository offerRepository) {
        this.cartRepository = cartRepository;
        this.offerRepository = offerRepository;
    }

    @PrimaryAdapter
    @Transactional
    public void addProduct(UUID cartId, UUID productId) {
        Cart cart = cartRepository.findBy(cartId);

        cart.addProduct(productId);

        cartRepository.save(cart);
    }

    @PrimaryAdapter
    @Transactional
    public void accept(UUID cartId) {
        Cart cart = cartRepository.findBy(cartId);

        Offer offer = cart.accept();

        offerRepository.save(offer);
    }
}
