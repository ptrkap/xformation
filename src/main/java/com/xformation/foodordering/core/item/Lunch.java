package com.xformation.foodordering.core.item;

import java.math.BigDecimal;

public class Lunch {
	private MainCourse mainCourse;
	private Dessert dessert;

	public Lunch(MainCourse mainCourse, Dessert dessert) {
		this.mainCourse = mainCourse;
		this.dessert = dessert;
	}
	
	@Override
	public String toString() {
		return mainCourse + "\n" +
			   dessert + "\n";
	}

	public BigDecimal getPrice() {
		return mainCourse.getPrice().add(dessert.getPrice());
	}
}
