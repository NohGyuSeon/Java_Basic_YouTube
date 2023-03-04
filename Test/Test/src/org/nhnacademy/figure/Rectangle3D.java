package org.nhnacademy.figure;

 
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle3D extends Rectangle {

    public Rectangle3D(Point location, double width, double height, Color color, Vector vector) {
        super(location, width, height, color, vector);
    }
    
    public void draw(Graphics pen) {
        pen.fill3DRect((int) (getX() - getWidth() / 2), (int) (getY() - getHeight() / 2), (int) getWidth(),
        (int) getHeight(), true);
         
    }

}