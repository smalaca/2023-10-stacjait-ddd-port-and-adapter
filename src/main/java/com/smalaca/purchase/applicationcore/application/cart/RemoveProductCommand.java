package com.smalaca.purchase.applicationcore.application.cart;

import java.util.UUID;

public record RemoveProductCommand(UUID cartId, UUID productId, int amount) {
}
