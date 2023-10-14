package com.smalaca.purchase.infrastructure.repository.inmemory.order;

import com.smalaca.annotation.architecture.SecondaryPort;
import com.smalaca.purchase.applicationcore.domain.order.Order;
import com.smalaca.purchase.applicationcore.domain.order.OrderRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SecondaryPort
public class InMemoryOrderRepository implements OrderRepository {
    private final Map<UUID, Order> orders = new HashMap<>();

    @Override
    public void save(Order order) {
        orders.put(order.getOrderId(), order);
    }
}
