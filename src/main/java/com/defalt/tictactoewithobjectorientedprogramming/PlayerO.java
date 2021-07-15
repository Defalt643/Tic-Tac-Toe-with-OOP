package com.defalt.tictactoewithobjectorientedprogramming;

public class PlayerO extends Table {

    String O;

    public PlayerO() {

    }

    public void addIntoTable(int[] position) {
        super.table[position[0]][position[1]] = "O";
    }

    public boolean checkTable(int[] position) {
        if (super.table[position[0]][position[1]].equals("-")) {
            addIntoTable(position);
            return true;
        } else {
            return false;
        }
    }

}
