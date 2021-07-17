package com.defalt.tictactoewithobjectorientedprogramming;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        while (true) {
            game.startGame();
            if (!game.restartGame()) {
                break;
            }
        }

    }
}
