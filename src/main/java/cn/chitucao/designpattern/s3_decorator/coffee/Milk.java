package cn.chitucao.designpattern.s3_decorator.coffee;

/**
 * @author DennyFly
 * @since 2020/9/25 15:09
 * 具体装饰类
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }

}
