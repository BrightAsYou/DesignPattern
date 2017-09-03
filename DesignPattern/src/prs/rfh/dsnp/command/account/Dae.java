package prs.rfh.dsnp.command.account;

/**
 * DesignPattern.
 *
 * @Desc 借行为.
 * @Author Swift.
 * @Date 2017/9/4.
 */
public class Dae {
    String entires;
    public Dae(String entires) {
        this.entires =  entires;
    }

    public void debit() {
        System.out.println("debit" + entires);
    }

    public void undo() {
        System.out.println("undo" + entires);
    }
}
