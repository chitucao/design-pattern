package cn.chitucao.designpattern.s3_decorator.stallgeneralextend;

/**
 * Created by Tom on 2019/3/17.
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    //加一个香肠加2块钱
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
