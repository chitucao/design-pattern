package cn.chitucao.designpattern.s1_proxy.staticproxy.general;

/**
 * @author DennyFly
 * @since 2020/9/14 15:38
 */
public class You implements GiveGift {
    BeautifulGirl mm ;     //美女

    public You(BeautifulGirl mm){
        this.mm = mm;
    }


    @Override
    public void giveBook() {
        System.out.println(mm.getName() +",送你一本书....");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + ",送你一盒巧克力....");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ",送你一束花....");
    }

}
