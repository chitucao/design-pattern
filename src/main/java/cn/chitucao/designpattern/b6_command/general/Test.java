package cn.chitucao.designpattern.b6_command.general;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        ICommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
