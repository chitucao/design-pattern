package cn.chitucao.designpattern.b5_chain.auth.optimiaze;


import cn.chitucao.designpattern.b5_chain.auth.Member;

/**
 * Created by Tom.
 */
public class MemberService {

    public void login(String loginName,String loginPass){
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandler(new Member(loginName,loginPass));

    }

}
