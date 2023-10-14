package com.smalaca.purchase.applicationcore.application.cart;

import java.util.UUID;

public record AddProductCommand(UUID cartId, UUID productId, int amount) {
}
