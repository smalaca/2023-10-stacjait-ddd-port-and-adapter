package com.smalaca.purchase.infrastructure.repository.inmemory.offer;

import com.smalaca.purchase.applicationcore.domain.offer.Offer;
import com.smalaca.purchase.applicationcore.domain.offer.OfferRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryOfferRepository implements OfferRepository {
    private final Map<UUID, Offer> offers = new HashMap<>();

    @Override
    public void save(Offer offer) {
        offers.put(offer.getOfferId(), offer);
    }
}
