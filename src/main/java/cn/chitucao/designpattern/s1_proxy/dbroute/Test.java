package cn.chitucao.designpattern.s1_proxy.dbroute;


import cn.chitucao.designpattern.s1_proxy.dbroute.proxy.OrderServiceDynamicProxy;
import cn.chitucao.designpattern.s1_proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        // 静态代理测试
//        staticTest();

        // 动态代理测试
        dynamicTest();

    }


    public static void staticTest() {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2020/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService) new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dynamicTest(){
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2020/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
