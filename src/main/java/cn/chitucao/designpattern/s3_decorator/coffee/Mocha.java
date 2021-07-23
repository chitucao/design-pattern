package cn.chitucao.designpattern.s3_decorator.coffee;

/**
 * @author DennyFly
 * @since 2020/9/25 15:09
 * 具体装饰类
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

}
