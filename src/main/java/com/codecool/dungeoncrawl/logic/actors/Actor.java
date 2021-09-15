package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;
import com.codecool.dungeoncrawl.logic.Drawable;

import java.util.List;

public abstract class Actor implements Drawable {
    private Cell cell;
    private int health = 10;
    private List<Key> keys;
    private List<Sword> swords;

    public Actor(Cell cell) {
        this.cell = cell;
        this.cell.setActor(this);
    }

    public void move(int dx, int dy) {
        Cell nextCell = cell.getNeighbor(dx, dy);
        cell.setActor(null);
        nextCell.setActor(this);
        cell = nextCell;
    }

    public void getItem(Object o) {
        switch (o.getClass().getSimpleName()) {
            case "Sword":
                swords.add((Sword) o);
                break;
            case "Key":
                keys.add((Key) o);
                makeAllMyKeyBlack();
                break;
            default:
                throw new IllegalArgumentException("Not key or shield; Cannot pick up");
        }
    }

    public void makeAllMyKeyBlack() {
        for (Key key : keys) {
            key.setColorRed(0);
            key.setColorGreen(0);
            key.setColorBlue(0);
        }
    }

    public int getHealth() {
        return health;
    }

    public Cell getCell() {
        return cell;
    }

    public int getX() {
        return cell.getX();
    }

    public int getY() {
        return cell.getY();
    }
}
