package cn.chitucao.designpattern.s2_facade.watchtv;

/**
 * @author DennyFly
 * @since 2020/9/25 14:39
 */
public class Client {
    public static void main(String[] args) {
        //实例化组件
        Light light = new Light();
        Television tv = new Television();
        AirCondition ac = new AirCondition();
        Screen screen = new Screen();

        WatchTvSwtichFacade watchTv = new WatchTvSwtichFacade(light, ac, tv, screen);

        watchTv.on();
        System.out.println("--------------可以看电视了.........");
        watchTv.off();
        System.out.println("--------------可以睡觉了...........");
    }
}
