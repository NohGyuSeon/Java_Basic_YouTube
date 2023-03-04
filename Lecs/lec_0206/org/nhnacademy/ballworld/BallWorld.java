package org.nhnacademy.ballworld;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class BallWorld {
    Logger logger;
    List<Ball>  balls;
    List<BallWorldView> views;

    public BallWorld(BallWorldView view) {
        super();

        logger = Logger.getLogger("global");
        balls = new LinkedList<>();
        this.views.setController(this);
        this.views = new LinkedList<>();
        this.views.add(view);
    }
    
    public void add(Ball ball) {
        balls.add(ball);
    }

    public List<Ball> getBalls() {
        return      balls;
    }

    public void run(long seconds) throws InterruptedException {
        for (BallWorldView view : views) {
            view.setVisible(true);
        }
        
        Thread.sleep(seconds * 1000);
    }
}
