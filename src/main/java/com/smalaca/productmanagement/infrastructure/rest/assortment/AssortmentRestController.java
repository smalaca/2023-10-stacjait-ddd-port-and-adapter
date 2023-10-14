package com.smalaca.productmanagement.infrastructure.rest.assortment;

import com.smalaca.productmanagement.applicationcore.application.assortment.AssortmentApplicationService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AssortmentRestController {
    private final AssortmentApplicationService assortmentApplicationService;

    public AssortmentRestController(AssortmentApplicationService assortmentApplicationService) {
        this.assortmentApplicationService = assortmentApplicationService;
    }

    public UUID addProduct(String productName) {
        UUID buyerId = getBuyerIdFromSession();
        UUID productId = assortmentApplicationService.addProduct(buyerId, productName);

        return productId;
    }

    private UUID getBuyerIdFromSession() {
        return null;
    }
}
