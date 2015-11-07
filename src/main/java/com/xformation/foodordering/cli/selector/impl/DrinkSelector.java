package com.xformation.foodordering.cli.selector.impl;

import static com.xformation.foodordering.cli.Messages.ICE_CUBES_OPTION;
import static com.xformation.foodordering.cli.Messages.LEMON_OPTION;
import com.xformation.foodordering.cli.Messages;
import com.xformation.foodordering.cli.selector.ItemSelector;
import com.xformation.foodordering.core.*;
import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.Drink;
import java.io.IOException;

/**
 * Created by PK on 11/6/2015.
 */
public class DrinkSelector extends ItemSelector<Drink> {

    public DrinkSelector(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public Drink select() throws IOException {
        Drink drink = super.select();
        if (checkAddition(ICE_CUBES_OPTION)) {
            drink.setIceCubes();
        }
        if (checkAddition(LEMON_OPTION)) {
            drink.setLemon();
        }
        return drink;
    }

    private boolean checkAddition(String message) throws IOException {
        System.out.println(message);
        switch (reader.readLine()) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                System.out.println(Messages.INVALID_CHOICE);
                return checkAddition(message);
        }
    }

    @Override
    protected Menu<Drink> getMenu() {
        return cuisine.getDrinksMenu();
    }

    @Override
    protected String getMessage() {
        return Messages.DRINK_SELECTION;
    }

    @Override
    protected Drink getItem(Integer choice) {
        return cuisine.getDrinksMenu().get(choice);
    }
}
