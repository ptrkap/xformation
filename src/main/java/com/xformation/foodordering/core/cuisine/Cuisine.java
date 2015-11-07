package com.xformation.foodordering.core.cuisine;

import com.xformation.foodordering.core.item.Dessert;
import com.xformation.foodordering.core.item.Drink;
import com.xformation.foodordering.core.item.MainCourse;
import com.xformation.foodordering.core.Menu;

abstract public class Cuisine {
	protected Menu<MainCourse> mainCoursesMenu = new Menu<>("MAIN COURSES");
	protected Menu<Dessert> dessertsMenu = new Menu<>("DESSERTS");
	protected Menu<Drink> drinksMenu = new Menu<>("DRINKS");
	
	public Menu<MainCourse> getMainCoursesMenu() {
		return mainCoursesMenu;
	}
	
	public Menu<Dessert> getDessertsMenu() {
		return dessertsMenu;
	}
	
	public Menu<Drink> getDrinksMenu() {
		return drinksMenu;
	}
}
