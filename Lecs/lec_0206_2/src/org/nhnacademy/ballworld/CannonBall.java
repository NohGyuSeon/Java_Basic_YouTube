package org.nhnacademy.ballworld;

import java.awt.Color;

import org.nhnacademy.ballworld.Point;

public class CannonBall extends MovableBall {
    /**
     * 중력
     */
    private double gravity;
    
    public CannonBall(Point location, double radius, Color color) {
        super(location, radius, color);
        this.gravity = 0;
    }

    public CannonBall(Point location, double radius) {
        super(location, radius);
    }
    
    /**
     * 
     * @param gravity
     */
    public void setGravity(double gravity) {
        this.gravity = gravity;
    }
    
    /** 
     * 
     * @return
     */
    public double getGravity() {
        return this.gravity;
    }

    /**
     * 볼을 이동하고, 볼이 바닥에 닿은 경우 움직임을 멈춘다.
     */
    @Override  
    public void move() {
        this.motion.addDY(-gravity);
        location.move(this.motion.getDX(), this.motion.getDY());
        // if (this.motion.getDY() == 0) {
        //     this.motion.setDXDY(0, 0);
        // }
    }
}  