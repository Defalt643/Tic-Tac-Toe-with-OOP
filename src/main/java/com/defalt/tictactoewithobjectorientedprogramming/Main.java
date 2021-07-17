package com.defalt.tictactoewithobjectorientedprogramming;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Game game=new Game();
        while(true){
            game.startGame();
            if(!game.restartGame()){
                break;
            }
        }
        

    }
}
