package cn.chitucao.designpattern.s1_proxy.dynamicproxy.myjdkproxy.client;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        MyMeipo gpMeipo = new MyMeipo();
        IPerson zhangsan = gpMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();


//        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();


    }
}
