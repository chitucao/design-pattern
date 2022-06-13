package cn.chitucao.designpattern.b1_strategy.pay.payport;


import cn.chitucao.designpattern.b1_strategy.pay.Payment;

/**
 * Created by Tom.
 */
public class AliPay extends Payment {

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }

}
