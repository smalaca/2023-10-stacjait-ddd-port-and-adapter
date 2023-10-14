package com.smalaca.productmanagement.infrastructure.repository.inmemory.assortment;

import com.smalaca.annotation.architecture.SecondaryAdapter;
import com.smalaca.productmanagement.applicationcore.domain.assortment.Assortment;
import com.smalaca.productmanagement.applicationcore.domain.assortment.AssortmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SecondaryAdapter
public class InMemoryAssortmentRepository implements AssortmentRepository {
    private final Map<UUID, Assortment> assortments = new HashMap<>();

    @Override
    public Assortment findBy(UUID buyerId) {
        return assortments.get(buyerId);
    }

    @Override
    public void save(Assortment assortment) {
        assortments.put(assortment.getBuyerId(), assortment);
    }
}
