package org.nhnacademy.figure;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Figure {
    protected Point location; 
    private double radius;
    private Color color;

    public Ball(Point location, double radius, Color color) {
        super(location);
        this.radius = radius;
        this.color = color;
    }

    public double getX() {
        return location.getX();
    }
 
    public double getY() {
        return location.getY();
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
        pen.fillOval(
            (int) (location.getX() - radius),
            (int) (location.getY() - radius),
            (int) (2 * radius),
            (int) (2 * radius));

        pen.setColor(oldColor);
    }

    @Override
    Region getRegion() {
        // TODO Auto-generated method stub
        return null;
    }
}