package cn.chitucao.designpattern.s6_adapter.general_robot_object;

/**
 * @author DennyFly
 * @since 2020/11/24 15:05
 */
public class BirdAdapter implements Robot {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void cry() {
        bird.jiji();
    }

    @Override
    public void move() {
        bird.fly();
    }
}
