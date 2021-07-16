package com.defalt.tictactoewithobjectorientedprogramming;

import java.util.*;

public class Main {

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

    public static Table startGame() {
        Table table = new Table();
        displayWelcomeAndTable(table);
        while (true) {
            if (table.round == 9) {
                System.out.println("Tie game....");
                break;
            }
            if (table.round % 2 == 0) {
                if(!table.addIntoTable("X", getInput(table.round))){
                    continue;
                }
            } else {
                if(!table.addIntoTable("O", getInput(table.round))){
                    continue;
                }
            }
            if (table.checkWinner()) {
                System.out.println("Player " + table.getWinner(table.round) + " win!!");
                break;
            }

        }return table;
    }

    public static boolean restartGame() {
        System.out.println("Want to start a new game?[Yes,No]");
        Scanner kb = new Scanner(System.in);
        while (true) {
            String status = kb.next();
            if (status.equals("Yes")) {
                return true;
            } else if (status.equals("No")) {
                return false;
            } else {
                System.out.println("Your input are mismatch. "
                        + "Please try again!");
            }
        }
    }public static void endGame(){    
        System.out.println("Bye bye....");
    }public static void showScore(Table table){
            System.out.println("Player name Win Lose Draw");
            System.out.println("      X     "+table.playerX.getWin()+"  "
                    +table.playerX.getLose()+"  "
                    +table.playerX.getDraw());
    }

    public static void main(String[] args) {
        while (true) {
            showScore(startGame());
            if(!restartGame()){
                break;
            }
        }

    }
}
