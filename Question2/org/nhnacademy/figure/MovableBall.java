package org.nhnacademy.figure;

import java.awt.Color;

public class MovableBall extends Ball {
    Vector vector;

    public MovableBall(Point location, double radius, Color color, Vector vector) {
        super(location, radius, color);
        this.vector = vector;
    }

    public void move(Region barrier) {
        if (location.getX() + getRadius() > barrier.getRight()) {
            vector.setDX(-vector.getDX());
        }
        if (location.getY() + getRadius() > barrier.getBottom()) {
            vector.setDY(-vector.getDY());
        }
        if (location.getX() - getRadius() <= barrier.getLeft()) {
            vector.setDX(-vector.getDX());
        }
        if (location.getY() <= barrier.getTop()) {
            vector.setDY(-vector.getDY());
        }
        location.setPoint(vector);
    }
}
