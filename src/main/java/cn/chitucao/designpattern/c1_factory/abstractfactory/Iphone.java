package cn.chitucao.designpattern.c1_factory.abstractfactory;

/**
 * @author DennyFly
 * @since 2020/3/20 11:28
 * 注意这里具体的生产方法可以由多个步骤组成
 */
public class Iphone extends Phone {

    @Override
    public void call() {
        System.out.println("Iphone call");
    }
}
