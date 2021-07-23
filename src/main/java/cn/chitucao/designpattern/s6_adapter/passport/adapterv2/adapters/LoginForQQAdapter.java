package cn.chitucao.designpattern.s6_adapter.passport.adapterv2.adapters;

import cn.chitucao.designpattern.s6_adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForQQAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        //accesseToken
        //time
        return super.loginForRegist(id,null);

    }

}
