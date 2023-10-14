package com.smalaca.purchase.infrastructure.rest.order;

import com.smalaca.purchase.query.order.OrderDetailsDto;
import com.smalaca.purchase.query.order.OrderDto;
import com.smalaca.purchase.query.order.OrderQueryService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class OrderRestController {
    private final OrderQueryService orderQueryService;

    public OrderRestController(OrderQueryService orderQueryService) {
        this.orderQueryService = orderQueryService;
    }

    public OrderDetailsDto findBy(UUID orderId) {
        return orderQueryService.findBy(orderId);
    }

    public List<OrderDto> findAll() {
        return orderQueryService.findAll();
    }
}
