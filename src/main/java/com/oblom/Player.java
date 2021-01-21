package com.oblom;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Player {
    private int Number;
    private int Score;
    public Player(int Number,int Score){
        this.Number = Number;
        this.Score = Score;
    }
    public int getNumber(){
        return Number;
    }
    public int getScore(){
        return Score;
    }
    public void setNumber(int number){
        this.Number = number;
    }
    public void setScore(int score){
        this.Score = score;
    }

}
