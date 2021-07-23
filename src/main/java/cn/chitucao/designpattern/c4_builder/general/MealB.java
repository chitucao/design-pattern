package cn.chitucao.designpattern.c4_builder.general;

/**
 * @author DennyFly
 * @since 2020/9/14 10:27
 */
public class MealB extends MealBuilder{

    @Override
    public void buildDrink() {
        meal.setDrink("一杯柠檬果汁");
    }

    @Override
    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

}
