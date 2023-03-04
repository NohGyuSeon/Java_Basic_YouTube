package org.nhnacademy.ballworld;

import java.awt.Color;

/**
 * MovableBall class.
 */
public class MovableBall extends Ball {
    protected Motion motion;
    protected Motion acceration;

    public MovableBall(Point location, double radius, Color color) {
        super(location, radius, color);
    }

    public MovableBall(Point location, double radius) {
        super(location, radius);
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public void setAcceleration(Motion acceleration) {
        this.acceration = acceleration;
    }

    public void addAcceleration(Motion acceleration) {
        this.acceration.add(acceleration);
    }
    
    /**
     * 단위 시간동안 움직임.
     */
    public void move() {
        location.move(this.motion.getDX(), this.motion.getDY());
    }

    /**
     * 볼의 X축 진행 방향을 반대로 뒤집다.
     */
    public void turnX() {
        motion.turnX();
    }

    /**
     * 볼의 Y축 진행 방향을 반대로 뒤집다.
     */
    public void turnY() {
        motion.turnY();
    }
}
