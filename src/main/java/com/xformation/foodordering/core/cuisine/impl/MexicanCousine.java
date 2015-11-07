package com.xformation.foodordering.core.cuisine.impl;

import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.impl.dessert.mexican.Cocadas;
import com.xformation.foodordering.core.item.impl.dessert.mexican.Polvoro;
import com.xformation.foodordering.core.item.impl.maincourse.mexican.Chorizo;
import com.xformation.foodordering.core.item.impl.dessert.mexican.Bionico;
import com.xformation.foodordering.core.item.impl.drink.mexican.MineralWater;
import com.xformation.foodordering.core.item.impl.drink.mexican.MintyMojitos;
import com.xformation.foodordering.core.item.impl.drink.mexican.SunsetMargarita;
import com.xformation.foodordering.core.item.impl.maincourse.mexican.Bistec;
import com.xformation.foodordering.core.item.impl.maincourse.mexican.Cabrito;

public class MexicanCousine extends Cuisine {

	public MexicanCousine() {
		mainCoursesMenu.add(new Bistec());
		mainCoursesMenu.add(new Cabrito());
		mainCoursesMenu.add(new Chorizo());

		dessertsMenu.add(new Bionico());
		dessertsMenu.add(new Cocadas());
		dessertsMenu.add(new Polvoro());
		
		drinksMenu.add(new MintyMojitos());
		drinksMenu.add(new SunsetMargarita());
		drinksMenu.add(new MineralWater());
	}
}
