package cn.chitucao.designpattern.s3_decorator.login;


/**
 * Created by Tom on 2019/3/17.
 */
public class SignServiceTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdServiceImpl(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }

}
