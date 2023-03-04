package org.nhnacademy.ground;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.List;

import org.nhnacademy.figure.Ball;
import org.nhnacademy.figure.Figure;
import org.nhnacademy.figure.Movable;
import org.nhnacademy.figure.MovableBall;
import org.nhnacademy.figure.Pentagon;
import org.nhnacademy.figure.Region;

import java.util.ArrayList;

public class BallWorld extends Frame {
    List<Figure> figures;
    long interval;	
    Region region;

    public BallWorld(int width, int height) {
        super();
        this.setSize(width, height);
        this.figures = new ArrayList<>();
        this.region = new Region(0, this.getWidth(), 45, this.getHeight());
        this.addWindowListener(new FrmWindowAdapter());

        this.interval = 100;
    }

	public double getInterval() {
		return interval;
	}
	
	public void setInterval(long interval) {
		this.interval = interval;
	}

    public void add(Figure figure) {
        this.figures.add(figure);
    }
    
    public void run() throws InterruptedException {
        while (true) {
            Thread.sleep(10);
            repaint();
        }
    }

    @Override
    public void paint(Graphics pen) {
        for(Figure figure: figures) {
            figure.draw(pen);
        }
    }

    public void next() {	
		for (Figure figure : figures) {
			if (figure instanceof Movable) {	//
				((Movable)figure).move(region);
			}
		}
	}
	
    public void run(long seconds) throws InterruptedException {		//
		long startTime = System.currentTimeMillis();	//
		while(System.currentTimeMillis() < startTime + seconds * 1000) {	//
			next();		//
			repaint();		//
			Thread.sleep(interval);	//
		}
	} 

}

