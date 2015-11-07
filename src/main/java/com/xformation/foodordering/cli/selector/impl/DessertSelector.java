package com.xformation.foodordering.cli.selector.impl;

import com.xformation.foodordering.cli.Messages;
import com.xformation.foodordering.cli.selector.ItemSelector;
import com.xformation.foodordering.core.*;
import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.Dessert;
import com.xformation.foodordering.core.item.Item;

import java.io.IOException;

/**
 * Created by PK on 11/6/2015.
 */
public class DessertSelector extends ItemSelector<Dessert> {

    public DessertSelector(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    protected Menu<Dessert> getMenu() {
        return cuisine.getDessertsMenu();
    }

    @Override
    protected String getMessage() {
        return Messages.DESSERT_SELECTION;
    }

    @Override
    protected Dessert getItem(Integer choice) {
        return cuisine.getDessertsMenu().get(choice);
    }
}
