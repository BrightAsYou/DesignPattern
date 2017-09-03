package prs.rfh.dsnp.command;

import prs.rfh.dsnp.command.account.Cae;
import prs.rfh.dsnp.command.account.Dae;
import prs.rfh.dsnp.command.command.CommandModeControl;
import prs.rfh.dsnp.command.transfer.P2PTransfer;
import prs.rfh.dsnp.command.transfer.Transable;
import prs.rfh.dsnp.command.transfer.Withoutdrawals;

/**
 * DesignPattern.
 *
 * @Desc //TODO 作用描述.
 * @Author Swift.
 * @Date 2017/9/4.
 */
public class CommandTest {
    public static void main(String[] args) {
        Cae cae = new Cae("404");
        Dae dae = new Dae("800");
        Cae cae1 = new Cae("800");
        Dae dae1 = new Dae("442");

        Withoutdrawals withoutdrawals = new Withoutdrawals(cae);
        Withoutdrawals withoutdrawals2 = new Withoutdrawals(cae1);

        P2PTransfer p2PTransfer = new P2PTransfer(dae);
        P2PTransfer p2PTransfer1 = new P2PTransfer(dae1);

        CommandModeControl control = new CommandModeControl();

        control.setCommand(0,withoutdrawals);
        control.setCommand(1,withoutdrawals2);
        control.setCommand(2,p2PTransfer);
        control.setCommand(3,p2PTransfer1);

        for (int i=0;i<4;i++){
            control.onButton(i);
        }
    }
}
