package com.smalaca.productmanagement.infrastructure.repository.inmemory.assortment;

import com.smalaca.annotation.architecture.SecondaryAdapter;
import com.smalaca.productmanagement.command.domain.assortment.Assortment;
import com.smalaca.productmanagement.command.domain.assortment.AssortmentRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@SecondaryAdapter
public class InMemoryAssortmentRepository implements AssortmentRepository {
    private final CrudRepository<Assortment, UUID> repository;

    public InMemoryAssortmentRepository(CrudRepository<Assortment, UUID> repository) {
        this.repository = repository;
    }

    @Override
    public Assortment findBy(UUID buyerId) {
        return repository.findById(buyerId).get();
    }

    @Override
    public void save(Assortment assortment) {
        repository.save(assortment);
    }
}
