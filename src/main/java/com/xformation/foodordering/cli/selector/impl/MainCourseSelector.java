package com.xformation.foodordering.cli.selector.impl;

import com.xformation.foodordering.cli.Messages;
import com.xformation.foodordering.cli.selector.ItemSelector;
import com.xformation.foodordering.core.cuisine.Cuisine;
import com.xformation.foodordering.core.item.MainCourse;
import com.xformation.foodordering.core.Menu;
import java.io.IOException;

/**
 * Created by PK on 11/6/2015.
 */
public class MainCourseSelector extends ItemSelector<MainCourse> {

    public MainCourseSelector(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    protected Menu<MainCourse> getMenu() {
        return cuisine.getMainCoursesMenu();
    }

    @Override
    protected String getMessage() {
        return Messages.MAIN_COURSE_SELECTION;
    }

    @Override
    protected MainCourse getItem(Integer choice) {
        return cuisine.getMainCoursesMenu().get(choice);
    }
}
