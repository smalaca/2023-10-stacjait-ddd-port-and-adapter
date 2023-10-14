package com.smalaca.productmanagement.infrastructure.rest.assortment;

import com.smalaca.productmanagement.command.application.assortment.AddProductCommand;
import com.smalaca.productmanagement.command.application.assortment.AssortmentApplicationService;
import com.smalaca.productmanagement.query.assortment.AssortmentQueryService;
import com.smalaca.productmanagement.query.assortment.ProductDetailsDto;
import com.smalaca.productmanagement.query.assortment.ProductDto;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
public class AssortmentRestController {
    private final AssortmentApplicationService assortmentApplicationService;
    private final AssortmentQueryService assortmentQueryService;

    public AssortmentRestController(
            AssortmentApplicationService assortmentApplicationService, AssortmentQueryService assortmentQueryService) {
        this.assortmentApplicationService = assortmentApplicationService;
        this.assortmentQueryService = assortmentQueryService;
    }

    public UUID addProduct(String productName, BigDecimal price) {
        UUID buyerId = getBuyerIdFromSession();
        UUID productId = assortmentApplicationService.addProduct(new AddProductCommand(buyerId, productName, price));

        return productId;
    }

    public ProductDetailsDto findBy(UUID productId) {
        return assortmentQueryService.findById(productId);
    }

    public List<ProductDto> findAll() {
        return assortmentQueryService.findAll();
    }

    private UUID getBuyerIdFromSession() {
        return null;
    }
}
