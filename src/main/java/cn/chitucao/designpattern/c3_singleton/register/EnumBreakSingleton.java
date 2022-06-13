package cn.chitucao.designpattern.c3_singleton.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author DennyFly
 * @since 2020/9/11 11:56
 */
public class EnumBreakSingleton {


    public static void main(String[] args) {
        // reflectBreak1();
        reflectBreak2();
    }

    // 序列化破坏
    private static void seriableBreak() {
        try {
            EnumSingleton instance1 = null;
            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setData(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 反射破坏 无参构造
    // 结果 java.lang.NoSuchMethodException  找不到无参的构造方法
    public static void reflectBreak1() {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 反射破坏 java.lang.enum 有参构造破坏
    // java.lang.IllegalArgumentException: Cannot reflectively create enum objects
    public static void reflectBreak2() {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("tom", 666);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
