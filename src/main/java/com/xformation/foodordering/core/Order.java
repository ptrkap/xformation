package com.xformation.foodordering.core;

import com.xformation.foodordering.core.item.Drink;
import com.xformation.foodordering.core.item.Lunch;
import java.math.BigDecimal;

public class Order {
	private Lunch lunch;
	private Drink drink;
	private BigDecimal totalPrice;

	private Order(Builder builder) {
		this.lunch = builder.lunch;
		this.drink = builder.drink;
		this.totalPrice = builder.totalPrice;
	}

	public static class Builder {
		private Lunch lunch;
		private Drink drink;
		private BigDecimal totalPrice = new BigDecimal(0);

		public Builder setLunch(Lunch lunch) {
			this.lunch = lunch;
			return this;
		}

		public Builder setDrink(Drink drink) {
			this.drink = drink;
			return this;
		}

		public Order build() {
			calcPrice();
			return new Order(this);
		}

		private void calcPrice() {
			if (lunch != null)
				totalPrice = totalPrice.add(lunch.getPrice());
			if (drink != null)
				totalPrice = totalPrice.add(drink.getPrice());
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder
				.append("\n-------------------- Order -------------------\n")
				.append(lunch != null ? lunch : "")
				.append(drink != null ? drink : "")
				.append("\n----------------------------------------------\n")
				.append("Total:\t\t\t\t\t")
				.append(Util.formatter.format(totalPrice))
				.append("\n");
		return stringBuilder.toString();
	}
}
