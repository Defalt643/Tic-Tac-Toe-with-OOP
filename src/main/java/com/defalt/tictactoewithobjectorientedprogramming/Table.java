package com.defalt.tictactoewithobjectorientedprogramming;

public class Table {
    String table[][]=new String[3][3];
    public Table(){
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table.length;j++){
                table[i][j]="-";
            }
        }
    }
        
}
