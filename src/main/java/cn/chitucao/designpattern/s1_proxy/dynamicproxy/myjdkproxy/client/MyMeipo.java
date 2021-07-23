package cn.chitucao.designpattern.s1_proxy.dynamicproxy.myjdkproxy.client;


import cn.chitucao.designpattern.s1_proxy.dynamicproxy.myjdkproxy.proxy.MyClassLoader;
import cn.chitucao.designpattern.s1_proxy.dynamicproxy.myjdkproxy.proxy.MyInvocationHandler;
import cn.chitucao.designpattern.s1_proxy.dynamicproxy.myjdkproxy.proxy.MyProxy;

import java.lang.reflect.Method;

/**
 * Created by Tom.
 */
public class MyMeipo implements MyInvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<?> clazz =  target.getClass();
        return (IPerson) MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target,args);
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
