package thrid;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

/**
 * Triangle.
 */
public class Triangle extends Frame {
    private int x;
    private int y;

    public static void main(String[] args) {
        Triangle triangle =   new Triangle(); 
    }

    Triangle() {
        setSize(500, 500);
        setVisible(true);
        
    }

    @Override
    public void paint(Graphics g) {
        int x, y = 0;
        Point cp = new Point(300, 300);

        Point[] a = new Point[3];
        a[0] = new Point(300, 100);
        a[1] = new Point(200, 200);
        a[2] = new Point(200, 100);

        TriangleArray t = new TriangleArray(a);

        g.drawLine(a[0].x, a[0].y, a[1].x, a[1].y);
        g.drawLine(a[1].x, a[1].y, a[2].x, a[2].y);
        g.drawLine(a[2].x, a[2].y, a[0].x, a[0].y);
    }

}

class TriangleArray {

    Point[] p;

    TriangleArray(Point[] p) {
        this.p = p;
    }

    TriangleArray(Point a, Point b, Point c) {
        p = new Point[3];
        p[0] = a;
        p[1] = a;
        p[2] = a;
    }
}

class Point {
    int x,
            y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}