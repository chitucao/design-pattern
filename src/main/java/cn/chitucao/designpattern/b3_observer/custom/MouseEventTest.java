package cn.chitucao.designpattern.b3_observer.custom;

import cn.chitucao.designpattern.b3_observer.custom.mouseevent.Mouse;
import cn.chitucao.designpattern.b3_observer.custom.mouseevent.MouseEventCallback;
import cn.chitucao.designpattern.b3_observer.custom.mouseevent.MouseEventType;

/**
 * Created by Tom on 2019/3/17.
 * 这里的测试是同步的
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK, callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS, callback);

        mouse.click();

        mouse.focus();


    }
}
