package prs.rfh.dsnp.facade;

/**
 * DesignPattern.
 *
 * @Desc //TODO 作用描述.
 * @Author Swift.
 * @Date 2017/9/6.
 */
public class Facade {
    ChangePwdServiceProvider changePwdServiceProvider;
    CheckAccountServiceProvider checkAccountServiceProvider;
    CheckUserServiceProvider checkUserServiceProvider;

    public void doLogin() {
        checkUserServiceProvider.doService();
        checkAccountServiceProvider.doService();
    }

    public void doChangePwd() {
        checkUserServiceProvider.doService();
        changePwdServiceProvider.doService();
    }

}
