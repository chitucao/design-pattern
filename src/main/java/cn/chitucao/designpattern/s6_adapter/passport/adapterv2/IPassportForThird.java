package cn.chitucao.designpattern.s6_adapter.passport.adapterv2;

import cn.chitucao.designpattern.s6_adapter.passport.ResultMsg;

/**
 * Created by Tom.
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
