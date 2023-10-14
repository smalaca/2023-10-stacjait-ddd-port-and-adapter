package com.smalaca.productmanagement.command.domain.assortment;

import com.smalaca.annotation.architecture.SecondaryPort;
import com.smalaca.annotation.ddd.DomainRepository;

import java.util.UUID;

@SecondaryPort
@DomainRepository
public interface AssortmentRepository {
    Assortment findBy(UUID buyerId);

    void save(Assortment assortment);
}
