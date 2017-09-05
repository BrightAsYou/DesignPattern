package prs.rfh.dsnp.bridge.impl;

import prs.rfh.dsnp.bridge.Handler;
import prs.rfh.dsnp.bridge.Launcher;

/**
 * DesignPattern.
 *
 * @Desc //TODO 作用描述.
 * @Author Swift.
 * @Date 2017/9/6.
 */
public class ICBCHandler extends Handler{

    Launcher launcher;

    @Override
    protected void execute(){

        launcher.preDo();
        launcher.doSend();
        launcher.afterDo();

    }
}
