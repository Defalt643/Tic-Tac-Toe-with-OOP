package com.defalt.tictactoewithobjectorientedprogramming;

public class Player extends Table {
    private String name;
    private int win,lose,draw;
    public Player(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public int getWin() {
        return win;
    }

    public void addWin() {
        win++;
    }

    public int getLose() {
        return lose;
    }

    public void addLose() {
        lose++;
    }

    public int getDraw() {
        return draw;
    }

    public void addDraw() {
        draw++;
    }
}
