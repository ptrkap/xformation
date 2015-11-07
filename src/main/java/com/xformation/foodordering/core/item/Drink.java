package com.xformation.foodordering.core.item;

import com.xformation.foodordering.core.Util;
import java.math.BigDecimal;

public abstract class Drink extends Item{
	private boolean iceCubes;
	private boolean lemon;
	
	public Drink(String name, BigDecimal price) {
		super(name, price);
	}

	public void setIceCubes() {
		this.iceCubes = true;
		price = price.add(new BigDecimal("0.50"));
	}

	public void setLemon() {
		this.lemon = true;
		price = price.add(new BigDecimal("1.00"));
	}
	
	@Override
	public String toString() {
		String completeName = name + 
				(iceCubes ? " + iceCubes" : "") +
				(lemon ? " + lemon" : "");
		return String.format("%-20s%10s", completeName, Util.formatter.format(price));
	}
}
