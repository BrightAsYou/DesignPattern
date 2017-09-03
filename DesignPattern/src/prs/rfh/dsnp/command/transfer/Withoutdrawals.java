package prs.rfh.dsnp.command.transfer;

import prs.rfh.dsnp.command.account.Cae;
import prs.rfh.dsnp.command.account.Dae;

/**
 * DesignPattern.
 *
 * @Desc 提现.
 * @Author Swift.
 * @Date 2017/9/4.
 */
public class Withoutdrawals implements Transable{

    Cae cae;//内部户

    public Withoutdrawals(Cae cae) {
        this.cae = cae;
    }


    @Override
    public void execute() {
        cae.credit();
    }

    @Override
    public void undo() {
        cae.undo();
    }
}
