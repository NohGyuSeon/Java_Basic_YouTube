package fourth;

import java.awt.Graphics;
import java.awt.Frame;

public class TriangleGPT extends Frame {

    private int level;

    public TriangleGPT(int level) {
        this.level = level;
    }

    public void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        if (level == 0) {
            // base case, draw a simple triangle
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3, y3);
            g.drawLine(x3, y3, x1, y1);
        } else {
            // recursively draw smaller triangles
            int x12 = (x1 + x2) / 2;
            int y12 = (y1 + y2) / 2;
            int x23 = (x2 + x3) / 2;
            int y23 = (y2 + y3) / 2;
            int x31 = (x3 + x1) / 2;
            int y31 = (y3 + y1) / 2;

            drawTriangle(g, x1, y1, x12, y12, x31, y31);
            drawTriangle(g, x12, y12, x2, y2, x23, y23);
            drawTriangle(g, x31, y31, x23, y23, x3, y3);
        }
    }

    // @Override
    // public void paint(Graphics graphics) {
    //     branch(graphics, x, y, this.Angle, this.length);
    // }
}

class Test {
    public static void main(String[] args) {
        TriangleGPT tree = new TriangleGPT(0);
        tree.setSize(500, 500);
        tree.drawTriangle(g, 100, 100, 100, 100, 100, 100);

        tree.setVisible(true);
        tree.show();
    }
}