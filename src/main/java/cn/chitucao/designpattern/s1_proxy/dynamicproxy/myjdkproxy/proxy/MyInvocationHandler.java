package cn.chitucao.designpattern.s1_proxy.dynamicproxy.myjdkproxy.proxy;

import java.lang.reflect.Method;

/**
 * @author DennyFly
 * @since 2020/9/14 16:57
 */
public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
