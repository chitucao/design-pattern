package cn.chitucao.designpattern.s3_decorator.coffee;

/**
 * @author DennyFly
 * @since 2020/9/25 15:06
 * 具体构件
 */
public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
