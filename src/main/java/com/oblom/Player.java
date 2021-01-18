package com.oblom;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Player {
    private int Number;
    private PlayerStatus Status;
    private int Score;
    public Player(int Number, PlayerStatus Status, int Score){
        this.Number = Number;
        this.Status = Status;
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
    public void setStatus(PlayerStatus status){
        this.Status = status;
    }
    public void setScore(int score){
        this.Score = score;
    }

}
