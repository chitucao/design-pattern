package cn.chitucao.designpattern.b1_chain.auth.builderchain;

import cn.chitucao.designpattern.b1_chain.auth.Member;

/**
 * Created by Tom.
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");
    }
}
