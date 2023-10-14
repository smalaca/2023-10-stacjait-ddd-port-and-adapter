package com.smalaca.purchase.applicationcore.domain.order;

import com.smalaca.annotation.architecture.SecondaryPort;

@SecondaryPort
public interface OrderRepository {
    void save(Order order);
}
