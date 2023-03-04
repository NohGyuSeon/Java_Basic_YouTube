import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class SingleBallWorld extends Frame {
    Ball ball;
   
    public SingleBallWorld(int width, int height) {
        super();
        setTitle("Ball World!!!");
        setSize(width, height);  

        ball = new Ball(new Point(width / 2.0, height / 2.0), Math.min(width, height) / 10, Color.BLUE);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        ball.paint(graphics);
    }
 
}
