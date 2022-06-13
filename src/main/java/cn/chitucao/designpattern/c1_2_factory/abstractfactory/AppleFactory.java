package cn.chitucao.designpattern.c1_2_factory.abstractfactory;

/**
 * @author DennyFly
 * @since 2020/3/20 11:25
 * 工厂的具体实现，产品族1
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone producePhone() {
        return new Iphone();
    }

    @Override
    public Computer producaComputer() {
        return new Mac();
    }
}
