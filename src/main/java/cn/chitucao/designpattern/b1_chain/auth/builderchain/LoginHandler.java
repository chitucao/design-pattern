package cn.chitucao.designpattern.b1_chain.auth.builderchain;


import cn.chitucao.designpattern.b1_chain.auth.Member;

/**
 * Created by Tom.
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        if(null != next) {
            next.doHandler(member);
        }
    }
}
