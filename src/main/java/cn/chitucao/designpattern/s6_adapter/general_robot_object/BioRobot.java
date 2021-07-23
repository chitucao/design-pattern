package cn.chitucao.designpattern.s6_adapter.general_robot_object;

/**
 * @author DennyFly
 * @since 2020/11/24 14:56
 */
public class BioRobot implements Robot {
    @Override
    public void cry() {
        System.out.println("仿生机器人叫.....");
    }

    @Override
    public void move() {
        System.out.println("仿生机器人慢慢移动....");
    }
}
