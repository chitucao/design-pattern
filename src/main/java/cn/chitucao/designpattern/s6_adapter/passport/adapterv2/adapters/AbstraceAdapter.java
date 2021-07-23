package cn.chitucao.designpattern.s6_adapter.passport.adapterv2.adapters;


import cn.chitucao.designpattern.s6_adapter.passport.PassportService;
import cn.chitucao.designpattern.s6_adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
