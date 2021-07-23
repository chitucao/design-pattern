package cn.chitucao.designpattern.s6_adapter.passport.adapterv2.adapters;

import cn.chitucao.designpattern.s6_adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
