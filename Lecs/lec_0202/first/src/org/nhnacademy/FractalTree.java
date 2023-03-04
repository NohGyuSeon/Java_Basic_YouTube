package org.nhnacademy;
import java.awt.Frame;
import java.awt.Graphics;
/**
 * FractalTree.
 */
public class FractalTree extends Frame {
    int x;
    int y;
    int Angle;
    int length;
    int rotate;
    int growth;
    int depth;
    /**
     * 생성자. 
     * @param width 너비
     * @param height 높이
     * @param x x
     * @param y y
     * @param angle angle
     * @param length length
     * @param rotate rotate
     * @param growth growth
     */
    public FractalTree(int width, int height, int x, int y,
            int angle, int length, int rotate, int growth) {
        this.x = x;
        this.y = y; 
        this.Angle = angle;
        this.length = length;
        this.rotate = rotate;
        this.growth = growth;
        
        this.setSize(width, height);
    }
    /**
     * 가지 그리기
     * @param graphics graphics
     * @param startX startX
     * @param startY startX
     * @param degree degree
     * @param length length
     */
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
        FractalTree tree = new FractalTree(500, 500, 250, 450, 90, 100, 30, 75);
        tree.setVisible(true);
        tree.show();
    }
}