package com.smalaca.productmanagement.command.application.assortment;

import com.smalaca.annotation.architecture.PrimaryAdapter;
import com.smalaca.productmanagement.command.domain.assortment.Assortment;
import com.smalaca.productmanagement.command.domain.assortment.AssortmentRepository;
import com.smalaca.productmanagement.command.domain.assortment.Price;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class AssortmentApplicationService {
    private final AssortmentRepository assortmentRepository;

    public AssortmentApplicationService(AssortmentRepository assortmentRepository) {
        this.assortmentRepository = assortmentRepository;
    }

    @PrimaryAdapter
    @Transactional
    public UUID addProduct(AddProductCommand command) {
        // 1. tłumaczenie typów prostych na język domenowy [0...*]
        Assortment assortment = assortmentRepository.findBy(command.buyerId());
        Price price = Price.price(command.price());

        // 2. wywołanie jednej metody na domenie
        assortment.addProduct(command.productName(), price);

        // 3. zapis zmian [1 ... *]
        assortmentRepository.save(assortment);
        return null;
    }
}
