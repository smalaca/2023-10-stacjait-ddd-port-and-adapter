package com.smalaca.productmanagement.command.application.assortment;

import java.util.UUID;

public record AddProductCommand(UUID buyerId, String productName) {
}
