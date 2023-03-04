package org.nhnacademy.test;
import java.awt.Color;

import org.nhnacademy.figure.MovableBall;
import org.nhnacademy.figure.Pentagon;
import org.nhnacademy.figure.Point;
import org.nhnacademy.figure.Vector;
import org.nhnacademy.ground.BallWorld;

public class App {
    public static void main(String[] args) throws InterruptedException {
        BallWorld ground = new BallWorld(800, 600);
        ground.add(new MovableBall(new Point(200, 200), 20, Color.pink, new Vector(-2, 2)));
        ground.add(new MovableBall(new Point(350, 300), 30, Color.orange, new Vector(2, -3)));

        ground.add(new Pentagon(new Point(250, 250), 10, Color.DARK_GRAY, new Vector(-3, 5)));
        ground.add(new Pentagon(new Point(450, 100), 40, Color.DARK_GRAY, new Vector(2, -3)));

        ground.setVisible(true);
        ground.run();
    }
}
