package com.defalt.tictactoewithobjectorientedprogramming;

public class Table {

    String table[][] = new String[3][3];
    String winnerName = "None";
    public int round = 0;

    public Table() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = "-";
            }
        }
    }

    public boolean checkExist(int position[]) {
        if (!table[position[0]][position[1]].equals("-")) {
            return true;
        }
        return false;
    }

    public boolean addIntoTable(String playerName, int position[]) {
        if (!checkExist(position)) {
            table[position[0]][position[1]] = playerName;
            displayTable();
            round++;
            return true;
        } else {
            System.out.println("Sorry this position is already exist. "
                    + "Please try again");
            return false;
        }
    }

    public boolean checkWinner() {

        if (checkHorizontal()) {
            return true;
        }
        if (checkVertical()) {
            return true;
        }
        if (checkDiagonal()) {
            return true;
        }
        return false;
    }

    public boolean checkHorizontal() {
        for (int i = 0; i < 3; i++) {
            if (table[i][0].equals(table[i][1])
                    && table[i][0].equals(table[i][2])
                    && !table[i][0].equals("-")) {
                winnerName = table[i][0];
                return true;
            }
        }
        return false;
    }

    public boolean checkVertical() {
        for (int i = 0; i < 3; i++) {
            if (table[0][i].equals(table[1][i])
                    && table[0][i].equals(table[2][i])
                    && !table[0][i].equals("-")) {
                winnerName = table[0][i];
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonal() {
        if (table[0][0].equals(table[1][1]) && table[0][0].equals(table[2][2])
                && !table[0][0].equals("-")) {
            winnerName = table[0][0];
            return true;
        }
        if (table[2][0].equals(table[1][1]) && table[2][0].equals(table[0][2])
                && !table[2][0].equals("-")) {
            winnerName = table[2][0];
            return true;
        }

        return false;
    }

    public String getWinner() {
        return winnerName;
    }

    public void displayTable() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " ");
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

}
