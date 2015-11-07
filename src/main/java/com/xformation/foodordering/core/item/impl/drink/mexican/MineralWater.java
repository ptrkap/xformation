package com.xformation.foodordering.core.item.impl.drink.mexican;

import com.xformation.foodordering.core.item.Drink;

import java.math.BigDecimal;

/**
 * Created by PK on 11/6/2015.
 */
public class MineralWater extends Drink {
    public MineralWater() {
        super("MineralWater", new BigDecimal("5.15"));
    }
}
