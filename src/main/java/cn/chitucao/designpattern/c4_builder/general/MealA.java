package cn.chitucao.designpattern.c4_builder.general;

/**
 * @author DennyFly
 * @since 2020/9/14 10:26
 */
public class MealA extends MealBuilder{

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }

    @Override
    public void buildFood() {
        meal.setFood("一盒薯条");
    }

}
