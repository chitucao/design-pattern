package cn.chitucao.designpattern.c4_builder.general;

/**
 * @author DennyFly
 * @since 2020/9/14 10:26
 */
public abstract class MealBuilder {
    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }
}
