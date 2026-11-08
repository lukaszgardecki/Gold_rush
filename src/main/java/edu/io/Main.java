package edu.io;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gold Rush");

        Board board = new Board();
        board.placeToken(3, 2, new Token(Board.PLAYER_TOKEN_LABEL));
        board.placeToken(4, 5 , new Token(Board.GOLD_TOKEN_LABEL));
        board.display();
    }
}
