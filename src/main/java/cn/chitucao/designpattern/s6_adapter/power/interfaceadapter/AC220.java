package cn.chitucao.designpattern.s6_adapter.power.interfaceadapter;

/**
 * Created by Tom.
 */
public class AC220 {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电压" + 220 + "V");
        return output;
    }
}
