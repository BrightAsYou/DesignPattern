package prs.rfh.dsnp.bridge.impl;

import prs.rfh.dsnp.bridge.Sender;

/**
 * DesignPattern.
 *
 * @Desc //TODO 作用描述.
 * @Author Swift.
 * @Date 2017/9/6.
 */
public class HttpSender extends Sender {
    @Override
    public void send() {
        System.out.println("send http msg");
    }
}
