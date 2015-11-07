package com.xformation.foodordering.cli.selector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PK on 11/7/2015.
 */
public abstract class Selector {

    protected BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public abstract Object select() throws IOException;
}
