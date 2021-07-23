package cn.chitucao.designpattern.s5_composite.fliesystem;

/**
 * @author DennyFly
 * @since 2020/11/24 14:25
 */
public class VideoFile extends File {

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }

}
