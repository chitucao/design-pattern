package cn.chitucao.designpattern.s5_composite.fliesystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DennyFly
 * @since 2020/11/24 14:20
 */
public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    /**
     * 浏览文件夹中的文件
     */
    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    /**
     * @param file
     * @return void
     * @desc 向文件夹中添加文件
     */
    public void add(File file) {
        files.add(file);
    }

    /**
     * @param file
     * @return void
     * @desc 从文件夹中删除文件
     */
    public void remove(File file) {
        files.remove(file);
    }

}
