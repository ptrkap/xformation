package com.xformation.foodordering.core.item;

import java.math.BigDecimal;

public abstract class Dessert extends Dish {
	public Dessert(String name, BigDecimal price) {
		super(name, price);
	}
}
