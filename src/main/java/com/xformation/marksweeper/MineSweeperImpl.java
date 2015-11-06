package com.xformation.marksweeper;

import java.util.Arrays;

/**
 * Created by PK on 11/5/2015.
 */
public class MineSweeperImpl implements MineSweeper {

    private char[][] mineField;

    public void setMineField(String mineField) throws IllegalArgumentException {
        MineFieldParser mineFieldParser = new MineFieldParser();
        this.mineField = mineFieldParser.parse(mineField);
    }

    public String getHintField() throws IllegalStateException {
        HintFieldGenerator hintFieldGenerator = new HintFieldGenerator();
        return hintFieldGenerator.generate(mineField);
    }
}
