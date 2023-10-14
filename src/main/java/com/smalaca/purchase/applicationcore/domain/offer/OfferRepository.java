package com.smalaca.purchase.applicationcore.domain.offer;

import com.smalaca.annotation.architecture.SecondaryPort;

@SecondaryPort
public interface OfferRepository {
    void save(Offer offer);
}
