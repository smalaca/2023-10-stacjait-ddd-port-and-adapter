package com.smalaca.productmanagement.command.application.assortment;

import java.math.BigDecimal;
import java.util.UUID;

public record AddProductCommand(UUID buyerId, String productName, BigDecimal price) {
}
