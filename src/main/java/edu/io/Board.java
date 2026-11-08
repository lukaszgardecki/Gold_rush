package edu.io;

public class Board {
    public static final String EMPTY_TOKEN_LABEL = "・";
    public static final String PLAYER_TOKEN_LABEL = "웃";
    public static final String GOLD_TOKEN_LABEL = "💰︎";
    public final int size;
    private final Token[][] grid;

    public Board() {
        this. size = 8;
        this.grid = new Token[size][size];
        clean();
    }

    public void clean() {
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                grid[col][row] = new Token(EMPTY_TOKEN_LABEL);
            }
        }
    }

    public void placeToken(int col, int row, Token token) {
        grid[col][row] = token;
    }

    public Token peekToken(int col, int row) {
        return grid[col][row];
    }

    public void display() {
        for (int col = 0; col < grid.length; col++) {
            for (int row = 0; row < grid[col].length; row++) {
                System.out.print(grid[col][row].label + " ");
            }
            System.out.println();
        }
    }
}
