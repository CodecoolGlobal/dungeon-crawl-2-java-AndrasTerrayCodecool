package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;

public class Key {
    private Cell cell;
    private int colorRed;
    private int colorGreen;
    private int colorBlue;

    public Key(Cell cell, int colorRed, int colorGreen, int colorBlue) {
        this.cell = cell;
        this.colorRed = colorRed;
        this.colorGreen = colorGreen;
        this.colorBlue = colorBlue;
    }

    public void pickUp(Actor actor) {
        actor.getItem(actor);
        if(actor.getHealth() > 100) {
            colorRed = 0;
            colorGreen = 0;
            colorBlue = 0;
        }
    }

    public void setColorRed(int colorRed) {
        this.colorRed = colorRed;
    }

    public void setColorGreen(int colorGreen) {
        this.colorGreen = colorGreen;
    }

    public void setColorBlue(int colorBlue) {
        this.colorBlue = colorBlue;
    }
}
