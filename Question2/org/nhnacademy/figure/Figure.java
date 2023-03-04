package org.nhnacademy.figure;

import java.awt.Graphics;

abstract public class Figure {
    Point location;
	
	Figure(Point location) {
		this.location = location;
	}
	
	public double getX() {
		return location.x;
	}
	
	public double getY() {
		return location.y;
	}
	
	abstract Region getRegion();
	abstract void draw(Graphics graphics); 

}
