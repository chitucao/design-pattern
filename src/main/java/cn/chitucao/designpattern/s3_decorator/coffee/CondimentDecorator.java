package cn.chitucao.designpattern.s3_decorator.coffee;

/**
 * @author DennyFly
 * @since 2020/9/25 15:07
 * 抽象装饰类
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
