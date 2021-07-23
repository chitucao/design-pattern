package cn.chitucao.designpattern.s5_composite.general.transparent;

//叶子节点
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
