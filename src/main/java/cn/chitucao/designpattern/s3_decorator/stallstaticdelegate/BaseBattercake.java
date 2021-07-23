package cn.chitucao.designpattern.s3_decorator.stallstaticdelegate;

/**
 * Created by Tom on 2019/3/17.
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg(){
        return "煎饼";
    }

    @Override
    public int getPrice(){
        return 5;
    }
}
