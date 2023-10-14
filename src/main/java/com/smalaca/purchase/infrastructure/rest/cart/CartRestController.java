package com.smalaca.purchase.infrastructure.rest.cart;

import com.smalaca.purchase.applicationcore.application.cart.AddProductCommand;
import com.smalaca.purchase.applicationcore.application.cart.CartApplicationService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CartRestController {
    private final CartApplicationService cartApplicationService;

    public CartRestController(CartApplicationService cartApplicationService) {
        this.cartApplicationService = cartApplicationService;
    }

    public void addProduct(AddProductCommand command) {
        cartApplicationService.addProduct(command);
    }

    public void accept(UUID cartId) {
        cartApplicationService.accept(cartId);
    }
}
