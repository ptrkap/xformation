package com.xformation.foodordering.core.item;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

abstract public class Item {
    protected String name;
    protected BigDecimal price;

    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
