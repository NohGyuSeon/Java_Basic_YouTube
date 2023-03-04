package org.nhnacademy.figure;

import java.awt.Graphics;

public abstract class Figure {
    Point location;
	
	Figure(Point location) {
		this.location = location;
	}
	
	public double getX() {
		return location.getX();
	}
	
	public double getY() {
		return location.getY();
	}
	
	abstract Region getRegion();
	public abstract void draw(Graphics graphics); 

}
