package prs.rfh.dsnp.bridge.impl;

import prs.rfh.dsnp.bridge.Launcher;
import prs.rfh.dsnp.bridge.Sender;

/**
 * DesignPattern.
 *
 * @Desc //TODO 作用描述.
 * @Author Swift.
 * @Date 2017/9/6.
 */
public class TradeLauncher extends Launcher {

    Sender sender;

    @Override
    public void preDo() {

    }

    @Override
    public void doSend() {
        sender.send();
    }

    @Override
    public void afterDo() {

    }
}
