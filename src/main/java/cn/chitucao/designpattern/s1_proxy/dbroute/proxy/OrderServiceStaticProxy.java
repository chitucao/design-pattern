package cn.chitucao.designpattern.s1_proxy.dbroute.proxy;


import cn.chitucao.designpattern.s1_proxy.dbroute.db.DynamicDataSourceEntity;
import cn.chitucao.designpattern.s1_proxy.dbroute.IOrderService;
import cn.chitucao.designpattern.s1_proxy.dbroute.Order;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom.
 */
public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据" );
        DynamicDataSourceEntity.set(dbRouter);

        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();

        return 0;
    }
}
