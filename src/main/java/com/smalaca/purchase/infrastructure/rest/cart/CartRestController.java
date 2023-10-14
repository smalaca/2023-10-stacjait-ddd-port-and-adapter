package com.smalaca.purchase.infrastructure.rest.cart;

import com.smalaca.purchase.applicationcore.application.cart.AddProductCommand;
import com.smalaca.purchase.applicationcore.application.cart.CartApplicationService;
import com.smalaca.purchase.applicationcore.application.cart.RemoveProductCommand;
import com.smalaca.purchase.query.cart.CartDto;
import com.smalaca.purchase.query.cart.CartQueryService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CartRestController {
    private final CartApplicationService cartApplicationService;
    private final CartQueryService cartQueryService;

    public CartRestController(CartApplicationService cartApplicationService, CartQueryService cartQueryService) {
        this.cartApplicationService = cartApplicationService;
        this.cartQueryService = cartQueryService;
    }

    public void addProduct(AddProductCommand command) {
        cartApplicationService.addProduct(command);
    }

    public void removeProduct(RemoveProductCommand command) {
        cartApplicationService.removeProduct(command);
    }

    public void accept(UUID cartId) {
        cartApplicationService.accept(cartId);
    }

    public CartDto findBy(UUID cartId) {
        return cartQueryService.findBy(cartId);
    }
}
