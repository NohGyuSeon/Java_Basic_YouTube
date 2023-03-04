package org.nhnacademy.figure;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(Vector vector) {
        this.x += vector.getDX();
        this.y += vector.getDY();
    }
    
    public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

}
