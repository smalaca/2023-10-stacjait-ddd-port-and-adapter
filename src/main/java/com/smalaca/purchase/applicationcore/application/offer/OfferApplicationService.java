package com.smalaca.purchase.applicationcore.application.offer;

import com.smalaca.annotation.architecture.PrimaryAdapter;
import com.smalaca.purchase.applicationcore.domain.offer.Offer;
import com.smalaca.purchase.applicationcore.domain.offer.OfferRepository;
import com.smalaca.purchase.applicationcore.domain.order.Order;
import com.smalaca.purchase.applicationcore.domain.order.OrderRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class OfferApplicationService {
    private final OfferRepository offerRepository;
    private final OrderRepository orderRepository;

    public OfferApplicationService(OfferRepository offerRepository, OrderRepository orderRepository) {
        this.offerRepository = offerRepository;
        this.orderRepository = orderRepository;
    }

    @PrimaryAdapter
    @Transactional
    public void accept(UUID offerId) {
        Offer offer = offerRepository.findBy(offerId);

        Order order = offer.accept();

        orderRepository.save(order);
    }
}
