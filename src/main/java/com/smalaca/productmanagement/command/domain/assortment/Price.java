package com.smalaca.productmanagement.command.domain.assortment;

import com.smalaca.annotation.ddd.Factory;
import com.smalaca.annotation.ddd.ValueObject;

import java.math.BigDecimal;

@ValueObject
public class Price {
    private final BigDecimal value;

    private Price(BigDecimal value) {
        this.value = value;
    }

    @Factory
    public static Price price(BigDecimal value) {
        if (isNotGreaterThanZero(value)) {
            throw new PriceException(value);
        }

        return new Price(value);
    }

    private static boolean isNotGreaterThanZero(BigDecimal value) {
        return BigDecimal.ZERO.compareTo(value) > -1;
    }
}
