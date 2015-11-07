package com.xformation.foodordering.core.cuisine.impl;

import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.impl.dessert.italian.Cassata;
import com.xformation.foodordering.core.item.impl.dessert.italian.Nutella;
import com.xformation.foodordering.core.item.impl.dessert.italian.Pandoro;
import com.xformation.foodordering.core.item.impl.drink.italian.Bellini;
import com.xformation.foodordering.core.item.impl.drink.italian.MineralWater;
import com.xformation.foodordering.core.item.impl.drink.italian.Negroni;
import com.xformation.foodordering.core.item.impl.maincourse.italian.Calzone;
import com.xformation.foodordering.core.item.impl.maincourse.italian.Lasagna;
import com.xformation.foodordering.core.item.impl.maincourse.italian.Spaghetti;

public class ItalianCousine extends Cuisine {

	public ItalianCousine() {
		mainCoursesMenu.add(new Lasagna());
		mainCoursesMenu.add(new Spaghetti());
		mainCoursesMenu.add(new Calzone());

		dessertsMenu.add(new Pandoro());
		dessertsMenu.add(new Nutella());
		dessertsMenu.add(new Cassata());
		
		drinksMenu.add(new Bellini());
		drinksMenu.add(new Negroni());
		drinksMenu.add(new MineralWater());
	}
}
