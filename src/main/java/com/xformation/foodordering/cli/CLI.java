package com.xformation.foodordering.cli;

import static com.xformation.foodordering.cli.Messages.*;
import com.xformation.foodordering.cli.selector.impl.CuisineSelector;
import com.xformation.foodordering.cli.selector.impl.DessertSelector;
import com.xformation.foodordering.cli.selector.impl.DrinkSelector;
import com.xformation.foodordering.cli.selector.impl.MainCourseSelector;
import com.xformation.foodordering.core.*;
import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.Dessert;
import com.xformation.foodordering.core.item.Drink;
import com.xformation.foodordering.core.item.Lunch;
import com.xformation.foodordering.core.item.MainCourse;
import java.io.IOException;

/**
 * Created by PK on 11/6/2015.
 */
public class CLI {

    public static void main(String[] args) throws IOException {
        Cuisine cuisine = new CuisineSelector().select();
        MainCourse mainCourse = new MainCourseSelector(cuisine).select();
        Dessert dessert = new DessertSelector(cuisine).select();
        Drink drink = new DrinkSelector(cuisine).select();

        Order order = new Order.Builder()
                .setLunch(new Lunch(mainCourse, dessert))
                .setDrink(drink)
                .build();

        System.out.println(order + ORDER_CONFIRMATION);
    }
}
