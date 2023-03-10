package cn.chitucao.designpattern.b3_observer.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者订阅事件
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    /**
     * @param o   被观察者
     * @param arg 事件
     */
    @Override
    public void update(Observable o, Object arg) {
        Student gper = (Student) o;
        Question question = (Question) arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
