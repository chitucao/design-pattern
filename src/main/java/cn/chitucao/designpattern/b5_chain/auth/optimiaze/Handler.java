package cn.chitucao.designpattern.b5_chain.auth.optimiaze;

import cn.chitucao.designpattern.b5_chain.auth.Member;

/**
 * Created by Tom.
 */
public abstract class Handler {
    protected Handler next;
    public void next(Handler next){ this.next = next;}

    public abstract void doHandler(Member member);
}
