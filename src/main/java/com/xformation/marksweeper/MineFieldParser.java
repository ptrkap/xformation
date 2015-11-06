package com.xformation.marksweeper;

import java.util.Arrays;
import java.util.List;

/**
 * Created by PK on 11/5/2015.
 */
public class MineFieldParser {

    private static final List<Character> ALLOWED_CHARS = Arrays.asList('*', '.');

    public char[][] parse(String mineFieldString) throws IllegalArgumentException{
        String[] rows = mineFieldString.split("\n");
        if (!allRowsHaveTheSameLength(rows)) {
            throw new IllegalArgumentException("All rows have to have the same length");
        }
        if (!allCharsAreCorrect(rows)) {
            throw new IllegalArgumentException(String.format("Only %s are allowed", ALLOWED_CHARS));
        }

        int n = rows.length;
        int m = rows[0].length();
        char[][] mineField = new char[n][m];

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                mineField[i][j] = rows[i].charAt(j);
            }
        }
        return mineField;
    }

    private boolean allCharsAreCorrect(String[] rows) {
        for (String row : rows) {
            for (int i = 0; i < row.length(); i++) {
                if (!ALLOWED_CHARS.contains(row.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean allRowsHaveTheSameLength(String[] rows) {
        if (rows.length == 0) {
            return false;
        }
        int rowLength = rows[0].length();
        for (int i = 1; i < rows.length; i++) {
            if (rows[i].length() != rowLength) {
                return false;
            }
        }
        return true;
    }
}
