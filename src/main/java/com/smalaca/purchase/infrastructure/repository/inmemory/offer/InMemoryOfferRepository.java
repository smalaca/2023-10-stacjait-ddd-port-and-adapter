package com.smalaca.purchase.infrastructure.repository.inmemory.offer;

import com.smalaca.annotation.architecture.SecondaryPort;
import com.smalaca.purchase.applicationcore.domain.offer.Offer;
import com.smalaca.purchase.applicationcore.domain.offer.OfferRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SecondaryPort
public class InMemoryOfferRepository implements OfferRepository {
    private final Map<UUID, Offer> offers = new HashMap<>();

    @Override
    public void save(Offer offer) {
        offers.put(offer.getOfferId(), offer);
    }

    @Override
    public Offer findBy(UUID offerId) {
        return offers.get(offerId);
    }
}
