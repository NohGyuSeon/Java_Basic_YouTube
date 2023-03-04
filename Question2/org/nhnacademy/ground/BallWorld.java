package org.nhnacademy.ground;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.List;

import org.nhnacademy.figure.Ball;
import org.nhnacademy.figure.MovableBall;
import org.nhnacademy.figure.Pentagon;
import org.nhnacademy.figure.Region;

import java.util.ArrayList;

public class BallWorld extends Frame {
    List<Ball> figures;
    List<Pentagon> pentagons;
    Region region;

    public BallWorld(int width, int height) {
        super();
        this.setSize(width, height);
        this.figures = new ArrayList<>();
        this.pentagons = new ArrayList<>();
        this.region = new Region(0, this.getWidth(), 45, this.getHeight());
        this.addWindowListener(new FrmWindowAdapter());
    }

    public void add(Ball ball) {
        this.figures.add(ball);
    }

    public void add(Pentagon pentagon) {
        this.pentagons.add(pentagon);
    }
    
    public void run() throws InterruptedException {
        while (true) {
            Thread.sleep(10);
            repaint();
        }
    }

    @Override
    public void paint(Graphics pen) {
        for(Ball ball: figures) {
            ball.draw(pen);
            ((MovableBall)ball).move(this.region);
        }

        for (Pentagon pentagon : pentagons) {
            pentagon.draw(pen);
            pentagon.move(this.region);
        }
    }
}
