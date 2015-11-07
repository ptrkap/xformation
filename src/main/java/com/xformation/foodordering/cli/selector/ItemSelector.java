package com.xformation.foodordering.cli.selector;

import com.xformation.foodordering.cli.Messages;
import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.Item;
import com.xformation.foodordering.core.Menu;
import java.io.IOException;

/**
 * Created by PK on 11/6/2015.
 */
public abstract class ItemSelector <T extends Item> extends Selector {

    protected final Cuisine cuisine;

    protected ItemSelector(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public T select() throws IOException {
        System.out.println(getMenu());
        System.out.println(getMessage());
        try {
            Integer choice = Integer.valueOf(reader.readLine()) - 1;
            return getItem(choice);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println(Messages.INVALID_CHOICE);
            return select();
        }
    }

    protected abstract Menu<T> getMenu();

    protected abstract String getMessage();

    protected abstract T getItem(Integer choice);
}
