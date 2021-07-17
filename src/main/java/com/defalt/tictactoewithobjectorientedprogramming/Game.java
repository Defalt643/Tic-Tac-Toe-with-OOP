package com.defalt.tictactoewithobjectorientedprogramming;

import java.util.*;

public class Game {

    Player playerX = new Player("X");
    Player playerO = new Player("O");

    public static void displayWelcomeAndTable(Table table) {
        System.out.println("Welcome to OX Game");
        table.displayTable();
    }

    public static int[] getInput(int round) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            if (round % 2 == 0) {
                System.out.println("X turn\nPlease input Row Col :");
            } else {
                System.out.println("O turn\nPlease input Row Col :");
            }
            String x1 = kb.next(), y1 = kb.next();
            if (!checkException(x1, y1)) {
                int x = Integer.parseInt(x1), y = Integer.parseInt(y1);
                int arr[] = {x - 1, y - 1};
                return arr;
            } else {
                continue;
            }
        }
    }

    public static boolean checkException(String x1, String y1) {
        try {
            int x = Integer.parseInt(x1) - 1;
            int y = Integer.parseInt(y1) - 1;
            int arr[] = {x, y};
            if (x > 2 || x < 0 || y > 2 || y < 0) {
                System.out.println("Row and Col must be 1 - 3.Please try again!");
                return true;
            }
            return false;

        } catch (Exception NumberFormatException) {
            System.out.println("Row and Col must be number.Please try again!");
            return true;
        }
    }

    public void startGame() {
        Table table = new Table();
        displayWelcomeAndTable(table);
        while (true) {
            if (table.round == 9) {
                System.out.println("Tie game....");
                updateScore(table);
                showScore();
                break;
            }
            if (table.round % 2 == 0) {
                if (!table.addIntoTable("X", getInput(table.round))) {
                    continue;
                }
            } else {
                if (!table.addIntoTable("O", getInput(table.round))) {
                    continue;
                }
            }
            if (table.checkWinner()) {
                System.out.println("Player " + table.getWinner(table.round) + " win!!");
                updateScore(table);
                showScore();
                break;
            }

        }

    }

    public static boolean restartGame() {
        System.out.println("Want to start a new game?[Yes,No]");
        Scanner kb = new Scanner(System.in);
        while (true) {
            String status = kb.next();
            if (status.equals("Yes")) {
                return true;
            } else if (status.equals("No")) {
                endGame();
                return false;
            } else {
                System.out.println("Your input are mismatch. "
                        + "Please try again!");
            }
        }
    }

    public static void endGame() {
        System.out.println("Bye bye....");
    }

    public void updateScore(Table table) {
        if (table.getWinner(table.round).equals("X")) {
            playerX.addWin();
            playerO.addLose();
        } else if(table.getWinner(table.round).equals("O")){
            playerO.addWin();
            playerX.addLose();
        }
        if (table.round == 9) {
            playerX.addDraw();
            playerO.addDraw();
        }
    }public void showScore(){
        System.out.println("========= Scoreboard =========");
        System.out.println("Player Win  Lose  Draw");    
        System.out.println("   X    "+playerX.getWin()+"     "+playerX.getLose()
                +"     "+playerX.getDraw());
        System.out.println("   O    "+playerO.getWin()+"     "+playerO.getLose()
                +"     "+playerO.getDraw());
        System.out.println("==============================");
    }
        

}
