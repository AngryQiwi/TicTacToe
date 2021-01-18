package com.oblom;

public class Cell {
    private int Coordinates;
    private int Content;
    public Cell(int Coordinates, int Content){
        this.Content = Content;
        this.Coordinates = Coordinates;
    }
    public int getCoordinates() {
        return Coordinates;
    }

    public int getContent() {
        return Content;
    }

    public void setCoordinates(int coordinates) {
        Coordinates = coordinates;
    }

    public void setContent(int content) {
        Content = content;
    }
}
