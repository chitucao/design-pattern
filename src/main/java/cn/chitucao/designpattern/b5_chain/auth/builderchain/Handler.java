package cn.chitucao.designpattern.b5_chain.auth.builderchain;


import cn.chitucao.designpattern.b5_chain.auth.Member;

/**
 * Created by Tom.
 */
public abstract class Handler<T> {
    protected Handler next;

    // 可以设置为private类型，更加高内聚
    private void next(Handler next){
        this.next = next;
    }

    public abstract void doHandler(Member member);

    public static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler handler){
//            do {
                if (this.head == null) {
                    this.head = this.tail = handler;
                    return this;
                }
                this.tail.next(handler);
                this.tail = handler;
//            }while (false);//真正框架中，如果是双向链表，会判断是否已经到了尾部
            return this;
        }

        public Handler<T> build(){
            return this.head;
        }

    }
}
