package com.xformation.foodordering.cli.selector.impl;

import static com.xformation.foodordering.cli.Messages.CUISINE_SELECTION;
import com.xformation.foodordering.cli.Messages;
import com.xformation.foodordering.cli.selector.Selector;
import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.cuisine.impl.ItalianCousine;
import com.xformation.foodordering.core.cuisine.impl.MexicanCousine;
import com.xformation.foodordering.core.cuisine.impl.PolishCousine;
import java.io.IOException;

/**
 * Created by PK on 11/7/2015.
 */
public class CuisineSelector extends Selector {

    @Override
    public Cuisine select() throws IOException {
        System.out.println(CUISINE_SELECTION);
        switch(reader.readLine()) {
            case "1":
                return new PolishCousine();
            case "2":
                return new MexicanCousine();
            case "3":
                return new ItalianCousine();
            default:
                System.out.println(Messages.INVALID_CHOICE);
                return select();
        }
    }
}
