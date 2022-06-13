package cn.chitucao.designpattern.c1_2_factory.abstractfactory;

/**
 * @author DennyFly
 * @since 2020/3/20 11:26
 * 工厂的具体实现，产品族2
 */
public class MiFactory implements AbstractFactory {
    @Override
    public Phone producePhone() {
        return new MiPhone();
    }

    @Override
    public Computer producaComputer() {
        return new MiComputer();
    }
}
