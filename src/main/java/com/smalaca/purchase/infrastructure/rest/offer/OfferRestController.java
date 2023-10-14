package com.smalaca.purchase.infrastructure.rest.offer;

import com.smalaca.purchase.applicationcore.application.offer.OfferApplicationService;
import com.smalaca.purchase.query.offer.OfferDto;
import com.smalaca.purchase.query.offer.OfferQueryService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OfferRestController {
    private final OfferApplicationService offerApplicationService;
    private final OfferQueryService offerQueryService;

    public OfferRestController(OfferApplicationService offerApplicationService, OfferQueryService offerQueryService) {
        this.offerApplicationService = offerApplicationService;
        this.offerQueryService = offerQueryService;
    }

    public void accept(UUID offerId) {
        offerApplicationService.accept(offerId);
    }

    public OfferDto findBy(UUID offerId) {
        return offerQueryService.findBy(offerId);
    }
}
