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
                int arr[] = {x-1, y-1};
                return arr;
            } else {
                continue;
            }
        }
    }

    public static boolean checkException(String x1, String y1) {
        try {
            int x = Integer.parseInt(x1)-1;
            int y = Integer.parseInt(y1)-1;
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

    public static void main(String[] args) {
        while (true) {
            Table table = new Table();
            displayWelcomeAndTable(table);
            while (true) {
                if (table.round == 9) {
                    System.out.println("Tie game....");
                    break;
                }
                
            }
        }

    }
}
