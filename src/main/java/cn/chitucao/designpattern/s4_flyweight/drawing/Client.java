package cn.chitucao.designpattern.s4_flyweight.drawing;

/**
 * @author DennyFly
 * @since 2020/9/25 17:31
 */
public class Client {

    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();

        System.out.println("一共绘制了" + FlyweightFactory.getSum() + "种颜色的圆形");
    }

}
