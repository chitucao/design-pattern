package cn.chitucao.designpattern.s6_adapter.passport.adapterv2.adapters;

import cn.chitucao.designpattern.s6_adapter.passport.ResultMsg;
/**
 * Created by Tom.
 */
public class LoginForWechatAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
