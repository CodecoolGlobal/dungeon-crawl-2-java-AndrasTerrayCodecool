package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;

public class Sword {
    private Cell cell;
    private int hitWhenUsed = 60;
    private int colorRed;
    private int colorGreen;
    private int colorBlue;
    private int statusInPercentage = 100;

    public Sword(Cell cell, int hitWhenUsed, int statusInPercentage) {
        this.cell = cell;
        this.hitWhenUsed = hitWhenUsed;
        this.statusInPercentage = statusInPercentage;
    }

    public void pickUp(Actor actor) {
        actor.getItem(actor);
        if(actor.getX() == this.cell.getX()) {
            this.hitWhenUsed += 10;
        }
    }

    public void setColor(int red, int green, int blue) {
        colorBlue = blue;
        colorGreen = green;
        colorRed = red;
    }
}
