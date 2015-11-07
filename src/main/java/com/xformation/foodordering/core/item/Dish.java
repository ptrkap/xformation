package com.xformation.foodordering.core.item;

import com.xformation.foodordering.core.Util;
import java.math.BigDecimal;

public abstract class Dish extends Item{

	public Dish(String name, BigDecimal price) {
		super(name, price);
	}

	@Override
	public String toString() {
		return String.format("%-20s%10s", name, Util.formatter.format(price));
	}
}
