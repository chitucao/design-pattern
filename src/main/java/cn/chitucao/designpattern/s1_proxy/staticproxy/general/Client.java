package cn.chitucao.designpattern.s1_proxy.staticproxy.general;

/**
 * @author DennyFly
 * @since 2020/9/14 15:39
 */
public class Client {
    public static void main(String[] args) {
        BeautifulGirl mm = new BeautifulGirl("小屁孩...");

        HerChum chum = new HerChum(mm);

        chum.giveBook();
        chum.giveChocolate();
        chum.giveFlowers();
    }
}
