package cn.chitucao.designpattern.s5_composite.fliesystem;

/**
 * @author DennyFly
 * @since 2020/11/24 14:24
 */
public class TextFile extends File{

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }

}
