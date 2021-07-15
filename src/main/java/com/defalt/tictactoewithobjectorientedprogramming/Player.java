package com.defalt.tictactoewithobjectorientedprogramming;

public class Player extends Table {

    int score[] = {0, 0, 0};

    public void addWin() {
        score[0]++;
    }

    public void addDraw() {
        score[1]++;
    }

    public void addLose() {
        score[2]++;
    }

    public int getWin() {
        return score[0];
    }

    public int getDraw() {
        return score[1];
    }

    public int getLose() {
        return score[2];
    }
}
