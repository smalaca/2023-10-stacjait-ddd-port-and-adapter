package com.smalaca.purchase.applicationcore.domain.offer;

import com.smalaca.annotation.architecture.SecondaryPort;

import java.util.UUID;

@SecondaryPort
public interface OfferRepository {
    void save(Offer offer);

    Offer findBy(UUID offerId);
}
