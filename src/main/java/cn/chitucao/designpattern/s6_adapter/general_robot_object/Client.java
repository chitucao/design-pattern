package cn.chitucao.designpattern.s6_adapter.general_robot_object;

/**
 * @author DennyFly
 * @since 2020/11/24 14:58
 */
public class Client {
    public static void main(String[] args) {
        BioRobot robot = new BioRobot();        //首先我们需要一个机器人
        Dog dog = new Dog();         //和一只狗

        //将这只狗包装到机器人中，使其有点儿像机器人
        Robot dogRobot = new DogAdapter(dog);

        //然后是机器人叫和跑
        System.out.println("BioRob cry.....");
        dogRobot.cry();
        dogRobot.move();
    }
}
