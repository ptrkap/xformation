package com.xformation.marksweeper;

/**
 * Created by PK on 11/5/2015.
 */
public class HintFieldGenerator {

    public static final char MINE = '*';

    public String generate(char[][] mineField) throws IllegalStateException{
        if (mineField == null) {
            throw new IllegalStateException("mine field is not initialized");
        }

        StringBuilder hintFieldsStringBuilder = new StringBuilder();
        int n = mineField.length;
        for (int i = 0; i < n; i++) {
            int m = mineField[i].length;
            for (int j = 0; j < m; j++) {
                if (mineField[i][j] == MINE) {
                    hintFieldsStringBuilder.append(MINE);
                } else {
                    int adjacentMinesNumber = calcAdjacentMinesNumber(mineField, i, j, n, m);
                    hintFieldsStringBuilder.append(adjacentMinesNumber);
                }
            }
            if (i < n-1) {
                hintFieldsStringBuilder.append('\n');
            }
        }
        return hintFieldsStringBuilder.toString();
    }

    private int calcAdjacentMinesNumber(char[][] mineField, int i, int j, int n, int m) {
        int adjacentMinesNumber = 0;
        if (i > 0){
            if (j > 0 && mineField[i-1][j-1] == MINE) {
                adjacentMinesNumber++;
            }
            if (mineField[i-1][j] == MINE) {
                adjacentMinesNumber++;
            }
            if (j < m-1 && mineField[i-1][j+1] == MINE) {
                adjacentMinesNumber++;
            }
        }
        if (j > 0 && mineField[i][j-1] == MINE) {
            adjacentMinesNumber++;
        }
        if (j < m-1 && mineField[i][j+1] == MINE) {
            adjacentMinesNumber++;
        }
        if (i < n-1) {
            if (j > 0 && mineField[i+1][j-1] == MINE) {
                adjacentMinesNumber++;
            }
            if (mineField[i+1][j] == MINE) {
                adjacentMinesNumber++;
            }
            if (j < m-1 && mineField[i+1][j+1] == MINE) {
                adjacentMinesNumber++;
            }
        }
        return adjacentMinesNumber;
    }
}
