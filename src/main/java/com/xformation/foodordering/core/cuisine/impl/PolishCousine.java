package com.xformation.foodordering.core.cuisine.impl;

import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.impl.drink.polish.MineralWater;
import com.xformation.foodordering.core.item.impl.maincourse.polish.Golabki;
import com.xformation.foodordering.core.item.impl.dessert.polish.Kisiel;
import com.xformation.foodordering.core.item.impl.dessert.polish.Kutia;
import com.xformation.foodordering.core.item.impl.dessert.polish.Makowiec;
import com.xformation.foodordering.core.item.impl.drink.polish.MiodPitny;
import com.xformation.foodordering.core.item.impl.drink.polish.PolskieWino;
import com.xformation.foodordering.core.item.impl.maincourse.polish.Bigos;
import com.xformation.foodordering.core.item.impl.maincourse.polish.PotatoPancakes;

public class PolishCousine extends Cuisine {
	
	public PolishCousine() {
		mainCoursesMenu.add(new PotatoPancakes());
		mainCoursesMenu.add(new Bigos());
		mainCoursesMenu.add(new Golabki());
		
		dessertsMenu.add(new Makowiec());
		dessertsMenu.add(new Kutia());
		dessertsMenu.add(new Kisiel());

		drinksMenu.add(new MiodPitny());
		drinksMenu.add(new PolskieWino());
		drinksMenu.add(new MineralWater());
	}
}
