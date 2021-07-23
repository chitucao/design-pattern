package cn.chitucao.designpattern.s3_decorator.coffee;

/**
 * @author DennyFly
 * @since 2020/9/25 15:12
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
