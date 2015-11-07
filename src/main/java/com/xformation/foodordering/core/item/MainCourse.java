package com.xformation.foodordering.core.item;

import java.math.BigDecimal;

public abstract class MainCourse extends Dish {
	public MainCourse(String name, BigDecimal price) {
		super(name, price);
	}
}
