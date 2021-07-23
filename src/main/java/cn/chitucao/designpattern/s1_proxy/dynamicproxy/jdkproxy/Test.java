package cn.chitucao.designpattern.s1_proxy.dynamicproxy.jdkproxy;


import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        printProxyContent();
    }

    public static void testDynamicProxy() {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();


        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();
    }

    // 导出class文件用于反编译出java代码
    public static void printProxyContent() {
        IPerson zhangsan = new JdkMeipo().getInstance(new Zhangsan());
        zhangsan.findLove();
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Zhangsan.class});
        try {
            FileOutputStream fos = new FileOutputStream("D://$Proxy0.class");
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
