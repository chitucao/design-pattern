package cn.chitucao.designpattern.s4_flyweight.drawing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DennyFly
 * @since 2020/9/25 17:30
 * 享元工厂类
 */
public class FlyweightFactory {
    static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String key){
        Shape shape = shapes.get(key);
        //如果shape==null,表示不存在,则新建,并且保持到共享池中
        if(shape == null){
            shape = new Circle(key);
            shapes.put(key, shape);
        }
        return shape;
    }

    public static int getSum(){
        return shapes.size();
    }

}
