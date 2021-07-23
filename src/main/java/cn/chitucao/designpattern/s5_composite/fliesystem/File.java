package cn.chitucao.designpattern.s5_composite.fliesystem;

/**
 * @author DennyFly
 * @since 2020/11/24 14:20
 */
public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
