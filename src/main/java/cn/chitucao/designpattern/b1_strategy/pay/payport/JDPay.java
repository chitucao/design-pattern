package cn.chitucao.designpattern.b1_strategy.pay.payport;

import cn.chitucao.designpattern.b1_strategy.pay.Payment;

/**
 * Created by Tom.
 */
public class JDPay extends Payment {

    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
