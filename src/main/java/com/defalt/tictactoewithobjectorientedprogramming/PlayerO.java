package com.defalt.tictactoewithobjectorientedprogramming;

public class PlayerO extends Table {

    public void addIntoTable(int[] position) {
        super.table[position[0]][position[1]] = "O";
        super.round++;
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
