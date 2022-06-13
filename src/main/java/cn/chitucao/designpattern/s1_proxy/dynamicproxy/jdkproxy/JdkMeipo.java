package cn.chitucao.designpattern.s1_proxy.dynamicproxy.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Proxy  用于创建代理对象1
 */
public class JdkMeipo implements InvocationHandler {
    private IPerson target;

    /**
     * ClassLoader 原始类加载器
     * interfaces  原始类的接口
     * InvocationHandler  代理方法
     */
    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * proxy    原始类
     * method   原始类的方法
     * args     原始类的方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
