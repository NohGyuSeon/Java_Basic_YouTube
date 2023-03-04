import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;

public class Ball extends Frame {
    Point location;
    double radius;
    Color color;
    
    public Ball(Point location, double radius) {
        this.location = location;
        this.radius = radius;
        this.color = Color.black;
    }
    
    public Ball(Point location, double radius, Color color) {
        this(location, radius);
        this.color = color;
    }

    public Point getLocation() {
        return location; 
    }
    
    public double getRadius() {
        return radius;
    }

    public void setColor(Color newColor) {
        color = newColor; 
    }

    public Color getColor() {
        return color;
    }

    public void paint(Graphics graphics) {
        Color oldColor = graphics.getColor();
        graphics.setColor(color);
        graphics.fillOval((int)(location.getX() - getRadius()), (int)(location.getY() - getRadius()), 
                       (int)(getRadius() * 2), (int)(getRadius() * 2));
        graphics.setColor(oldColor);
    }

}