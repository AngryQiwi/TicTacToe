package com.oblom;

public class Computer extends Player{
    private int Difficulty;
    public Computer(int Difficulty, int Number, PlayerStatus Status, int Score){
        super(Number, Status, Score);
        this.Difficulty = Difficulty;
    }
    public int getDifficulty(){
        return Difficulty;
    }
    public void setDifficulty(int Difficulty){
        this.Difficulty = Difficulty;
    }

    public int makeAMove(int PlayerMove, int MoveNumber, int cellContent11, int cellContent12, int cellContent13, int cellContent21, int cellContent22, int cellContent23, int cellContent31, int cellContent32, int cellContent33){
        if (cellContent22 == 0 && MoveNumber == 1) return 22;
        if (cellContent22 == 1 && MoveNumber == 1 || MoveNumber == 3 && cellContent13 == 0) return 13;


        if (cellContent11 == 2 && cellContent12 == 2 && cellContent13 == 0) return 13;
        if (cellContent11 == 2 && cellContent13 == 2 && cellContent12 == 0) return 12;
        if (cellContent12 == 2 && cellContent13 == 2 && cellContent11 == 0) return 11;
        if (cellContent21 == 2 && cellContent22 == 2 && cellContent23 == 0) return 23;
        if (cellContent21 == 2 && cellContent23 == 2 && cellContent22 == 0) return 22;
        if (cellContent22 == 2 && cellContent23 == 2 && cellContent21 == 0) return 21;
        if (cellContent31 == 2 && cellContent32 == 2 && cellContent33 == 0) return 33;
        if (cellContent31 == 2 && cellContent33 == 2 && cellContent32 == 0) return 32;
        if (cellContent32 == 2 && cellContent33 == 2 && cellContent31 == 0) return 31;
        if (cellContent11 == 2 && cellContent21 == 2 && cellContent31 == 0) return 31;
        if (cellContent11 == 2 && cellContent31 == 2 && cellContent21 == 0) return 21;
        if (cellContent21 == 2 && cellContent31 == 2 && cellContent11 == 0) return 11;
        if (cellContent12 == 2 && cellContent32 == 2 && cellContent22 == 0) return 22;
        if (cellContent12 == 2 && cellContent22 == 2 && cellContent32 == 0) return 32;
        if (cellContent22 == 2 && cellContent32 == 2 && cellContent12 == 0) return 12;
        if (cellContent13 == 2 && cellContent23 == 2 && cellContent33 == 0) return 33;
        if (cellContent23 == 2 && cellContent33 == 2 && cellContent13 == 0) return 13;
        if (cellContent13 == 2 && cellContent33 == 2 && cellContent23 == 0) return 23;
        if (cellContent11 == 2 && cellContent22 == 2 && cellContent33 == 0) return 33;
        if (cellContent11 == 2 && cellContent33 == 2 && cellContent22 == 0) return 22;
        if (cellContent22 == 2 && cellContent33 == 2 && cellContent11 == 0) return 11;
        if (cellContent13 == 2 && cellContent22 == 2 && cellContent31 == 0) return 31;
        if (cellContent13 == 2 && cellContent31 == 2 && cellContent22 == 0) return 22;
        if (cellContent22 == 2 && cellContent31 == 2 && cellContent13 == 0) return 13;


        if (cellContent11 == 1 && cellContent12 == 1 && cellContent13 == 0) return 13;
        if (cellContent11 == 1 && cellContent13 == 1 && cellContent12 == 0) return 12;
        if (cellContent12 == 1 && cellContent13 == 1 && cellContent11 == 0) return 11;
        if (cellContent21 == 1 && cellContent22 == 1 && cellContent23 == 0) return 23;
        if (cellContent21 == 1 && cellContent23 == 1 && cellContent22 == 0) return 22;
        if (cellContent22 == 1 && cellContent23 == 1 && cellContent21 == 0) return 21;
        if (cellContent31 == 1 && cellContent32 == 1 && cellContent33 == 0) return 33;
        if (cellContent31 == 1 && cellContent33 == 1 && cellContent32 == 0) return 32;
        if (cellContent32 == 1 && cellContent33 == 1 && cellContent31 == 0) return 31;
        if (cellContent11 == 1 && cellContent21 == 1 && cellContent31 == 0) return 31;
        if (cellContent11 == 1 && cellContent31 == 1 && cellContent21 == 0) return 21;
        if (cellContent21 == 1 && cellContent31 == 1 && cellContent11 == 0) return 11;
        if (cellContent12 == 1 && cellContent32 == 1 && cellContent22 == 0) return 22;
        if (cellContent12 == 1 && cellContent22 == 1 && cellContent32 == 0) return 32;
        if (cellContent22 == 1 && cellContent32 == 1 && cellContent12 == 0) return 12;
        if (cellContent13 == 1 && cellContent23 == 1 && cellContent33 == 0) return 33;
        if (cellContent23 == 1 && cellContent33 == 1 && cellContent13 == 0) return 13;
        if (cellContent13 == 1 && cellContent33 == 1 && cellContent23 == 0) return 23;
        if (cellContent11 == 1 && cellContent22 == 1 && cellContent33 == 0) return 33;
        if (cellContent11 == 1 && cellContent33 == 1 && cellContent22 == 0) return 22;
        if (cellContent22 == 1 && cellContent33 == 1 && cellContent11 == 0) return 11;
        if (cellContent13 == 1 && cellContent22 == 1 && cellContent31 == 0) return 31;
        if (cellContent13 == 1 && cellContent31 == 1 && cellContent22 == 0) return 22;
        if (cellContent22 == 1 && cellContent31 == 1 && cellContent13 == 0) return 13;

        if (cellContent11 == 1 && cellContent12 == 1 && cellContent13 == 0) return 13;
        if (cellContent11 == 1 && cellContent13 == 1 && cellContent12 == 0) return 12;
        if (cellContent12 == 1 && cellContent13 == 1 && cellContent11 == 0) return 11;
        if (cellContent21 == 1 && cellContent22 == 1 && cellContent23 == 0) return 23;
        if (cellContent21 == 1 && cellContent23 == 1 && cellContent22 == 0) return 22;
        if (cellContent22 == 1 && cellContent23 == 1 && cellContent21 == 0) return 21;
        if (cellContent31 == 1 && cellContent32 == 1 && cellContent33 == 0) return 33;
        if (cellContent31 == 1 && cellContent33 == 1 && cellContent32 == 0) return 32;
        if (cellContent32 == 1 && cellContent33 == 1 && cellContent31 == 0) return 31;
        if (cellContent11 == 1 && cellContent21 == 1 && cellContent31 == 0) return 31;
        if (cellContent11 == 1 && cellContent31 == 1 && cellContent21 == 0) return 21;
        if (cellContent21 == 1 && cellContent31 == 1 && cellContent11 == 0) return 11;
        if (cellContent12 == 1 && cellContent32 == 1 && cellContent22 == 0) return 22;
        if (cellContent12 == 1 && cellContent22 == 1 && cellContent32 == 0) return 32;
        if (cellContent22 == 1 && cellContent32 == 1 && cellContent12 == 0) return 12;
        if (cellContent13 == 1 && cellContent23 == 1 && cellContent33 == 0) return 33;
        if (cellContent23 == 1 && cellContent33 == 1 && cellContent13 == 0) return 13;
        if (cellContent13 == 1 && cellContent33 == 1 && cellContent23 == 0) return 23;
        if (cellContent11 == 1 && cellContent22 == 1 && cellContent33 == 0) return 33;
        if (cellContent11 == 1 && cellContent33 == 1 && cellContent22 == 0) return 22;
        if (cellContent22 == 1 && cellContent33 == 1 && cellContent11 == 0) return 11;
        if (cellContent13 == 1 && cellContent22 == 1 && cellContent31 == 0) return 31;
        if (cellContent13 == 1 && cellContent31 == 1 && cellContent22 == 0) return 22;
        if (cellContent22 == 1 && cellContent31 == 1 && cellContent13 == 0) return 13;
        return 0;
    }
}
