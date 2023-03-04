package fourth;

import java.awt.Frame;
import java.awt.Graphics;
/**
 * FractalTree.
 */
public class Triangle extends Frame {
    int x;
    int y;
    int Angle;
    int length;
    int rotate;
    int growth;
    int depth;

    public Triangle(int width, int height, int x, int y,
            int angle, int length, int rotate, int growth) {
        this.x = x;
        this.y = y; 
        this.Angle = angle;
        this.length = length;
        this.rotate = rotate;
        this.growth = growth;
        
        this.setSize(width, height);
    }
  
    public void branch(Graphics graphics, int startX, int startY, int degree, int length) {
        if (length > 1) {
            int endX = (int) (startX - length * Math.cos(Math.toRadians(degree)));
            int endY = (int) (startY - length * Math.sin(Math.toRadians(degree)));
            int branchLength = (int)(length * growth * 0.01);

            graphics.drawLine(startX, startY, endX, endY);
            branch(graphics, endX, endY, degree + rotate, branchLength);
            branch(graphics, endX, endY, degree - rotate, branchLength);
        }
    }
    
    @Override
    public void paint(Graphics graphics) {
        branch(graphics, x, y, this.Angle, this.length);
    }
    
    public static void main(String[] args) {
        Triangle tree = new Triangle(500, 500, 250, 450, 90, 100, 30, 75);
        tree.setVisible(true);
        tree.show();
    }  
}