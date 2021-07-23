package cn.chitucao.designpattern.s1_proxy.staticproxy.general;

/**
 * @author DennyFly
 * @since 2020/9/14 15:39
 * 这里可以加上增强
 */
public class HerChum implements GiveGift {

    // 注意这里的you是实现类，而不是抽象接口，也是静态代理模式的弊端
    You you;

    public HerChum(BeautifulGirl mm) {
        you = new You(mm);
    }

    @Override
    public void giveBook() {
        you.giveBook();
    }

    @Override
    public void giveChocolate() {
        you.giveChocolate();
    }

    @Override
    public void giveFlowers() {
        you.giveFlowers();
    }

}
