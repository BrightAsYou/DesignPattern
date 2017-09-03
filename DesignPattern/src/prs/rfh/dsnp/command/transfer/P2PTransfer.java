package prs.rfh.dsnp.command.transfer;

import prs.rfh.dsnp.command.account.Dae;

/**
 * DesignPattern.
 *
 * @Desc //TODO 作用描述.
 * @Author Swift.
 * @Date 2017/9/4.
 */
public class P2PTransfer implements Transable{

    Dae dae;//内部户

    public P2PTransfer(Dae dae) {
        this.dae = dae;
    }

    @Override
    public void execute() {
        dae.debit();
    }

    @Override
    public void undo() {
        dae.undo();
    }
}
