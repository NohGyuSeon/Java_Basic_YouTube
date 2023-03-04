package org.nhnacademy.ballworld;

import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Logger;
import java.awt.Graphics;

public class BallWorldView extends Frame {
    Logger logger;
    BallWorld controller;

    public BallWorldView(int width, int height) {
        super();

        logger = Logger.getLogger("global");
        setSize(width, height);
    }


    public void setController(BallWorld controller) {
        this.controller = controller;
    }

    public int translateX(int x) {
        return  getHeight() - x;
    }

    public int translateY(int y) {
        return  getHeight() - y / scale;
    }

    public void translateLength(double radius) {

    }
    
    protected void draw(Graphics graphics, Ball ball) {
        graphics.setColor(ball.getColor());
            (int) translateX(ball.getLocation().getX() - ball.getRadius());
            (int) translateY (ball.getLocation().getY() + ball.getRadius());
            (int) (2 * translateLength(ball.getRadius()));
            (int) (2 * translateLength(ball.getRadius()));
    //     graphics.fillOval((int) (ball.getLocation().getX() - ball.getRadius()),
    //             translateY((int) (ball.getLocation().getY() + ball.getRadius())),
    //             (int) (2 * ball.getRadius()), (int) (2 * ball.getRadius()));
        }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        if (this.controller != null) {
            for(Ball ball : this.controller.getBalls()) {
                Color oldColor = graphics.getColor();
                draw(graphics, ball);
                graphics.setColor(oldColor);
            }
        } 
    }
}
