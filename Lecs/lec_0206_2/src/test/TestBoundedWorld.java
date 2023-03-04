package test;

import java.awt.Color;
import org.nhnacademy.ballworld.Ball;
import org.nhnacademy.ballworld.BoundedWorld;
import org.nhnacademy.ballworld.Motion;
import org.nhnacademy.ballworld.MovableBall;
import org.nhnacademy.ballworld.Point;
import org.nhnacademy.ballworld.CannonBall;

/**
 * 테스트 코드.
 */
public class TestBoundedWorld {
    /**
     * 테스트 메인.
     *
     * @param args 사용하지 않음
     * @throws InterruptedException 처리하지 않음.
     */
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld ballWorld = new BoundedWorld(500, 400);

        CannonBall ball = new CannonBall(new Point(20, 20), 20.0, Color.BLUE);
        ball.setMotion(new Motion(20, 45));
        ball.setGravity(9.8 / 10);
        ballWorld.add(ball);
        ballWorld.setInterval(100);
        ballWorld.setVisible(true);
        ballWorld.run(1000);
    }
} 