package cn.chitucao.designpattern.b5_chain.auth.builderchain;

import cn.chitucao.designpattern.b5_chain.auth.Member;
import org.apache.commons.lang.StringUtils;

/**
 * Created by Tom.
 */
public class ValidateHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if(StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        if(null != next) {
            next.doHandler(member);
        }
    }
}
