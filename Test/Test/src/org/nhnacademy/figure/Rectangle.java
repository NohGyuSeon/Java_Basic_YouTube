package org.nhnacademy.figure;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure  implements Movable {
    private double radius;
    private Color color;
    private double width;
    private double height;
    Vector vector;

    public Rectangle(Point location, double width, double height, Color color, Vector vector) {
        super(location);
        this.width = width; 
        this.height = height;
        this.color = color;
        this.vector = vector;
    }

    public double getX() {
        return location.getX();
    }
  
    public double getY() {
        return location.getY();
    }

    public double getWidth() {
        return  width;
    }

    public double getHeight() {
        return  height;
    }

    public Point getLocation() {
        return location;
    }

    public double getRadius() {
        return radius;
    }

    public void draw(Graphics pen) {
        Color oldColor = pen.getColor();
        pen.setColor(color);

        pen.fillRect((int) (getX() - getWidth() / 2), (int) (getY() - getHeight() / 2), (int) getWidth(),
        (int) getHeight());

        pen.setColor(oldColor); 
    }

    public void move(Region barrier) {
        if (location.getY() + 2*getRadius() >= barrier.getBottom()) {
            vector.setDY(-vector.getDY());
        }
        if (location.getX() + 2*getRadius() >= barrier.getRight()) {
            vector.setDX(-vector.getDX());
        }
        if (location.getX() + getRadius() <= barrier.getLeft()) {
            vector.setDX(-vector.getDX());
        }
        if (location.getY() + 2*getRadius() <= barrier.getTop()) {
            vector.setDY(-vector.getDY());
        }
        location.setPoint(vector);
    }

    @Override
    Region getRegion() {
        // TODO Auto-generated method stub  cv   
        return null;
    }

    @Override
    public void next() {
        location.setPoint(vector);
    }

}