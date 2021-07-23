package cn.chitucao.designpattern.s6_adapter.power.interfaceadapter;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
