package com.smalaca.purchase.infrastructure.rest.offer;

import com.smalaca.purchase.applicationcore.application.offer.OfferApplicationService;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OfferRestController {
    private final OfferApplicationService offerApplicationService;

    public OfferRestController(OfferApplicationService offerApplicationService) {
        this.offerApplicationService = offerApplicationService;
    }

    public void accept(UUID offerId) {
        offerApplicationService.accept(offerId);
    }
}
