package cn.chitucao.designpattern.s3_decorator.coffee;

/**
 * @author DennyFly
 * @since 2020/9/25 15:04
 * 具体构件
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.21;
    }
}
