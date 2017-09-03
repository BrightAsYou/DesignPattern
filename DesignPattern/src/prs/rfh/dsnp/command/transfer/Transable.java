package prs.rfh.dsnp.command.transfer;

/**
 * DesignPattern.
 * @Desc 资金流转.
 * @Author Swift.
 * @Date 2017/9/4.
 */
public interface Transable {

    public void execute();

    public void undo();

}
