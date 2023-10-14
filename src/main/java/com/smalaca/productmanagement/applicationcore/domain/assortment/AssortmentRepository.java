package com.smalaca.productmanagement.applicationcore.domain.assortment;

import com.smalaca.annotation.architecture.SecondaryPort;

import java.util.UUID;

@SecondaryPort
public interface AssortmentRepository {
    Assortment findBy(UUID buyerId);

    void save(Assortment assortment);
}
