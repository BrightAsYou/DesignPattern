package prs.rfh.dsnp.command.account;

/**
 * DesignPattern.
 *
 * @Desc 贷行为
 * @Author Swift.
 * @Date 2017/9/4.
 */
public class Cae {

    String entires;
    public Cae(String entires) {
        this.entires =  entires;
    }

    public void credit (){
        System.out.println("credit" + entires);
    }
    public void undo (){
        System.out.println("undo" + entires);
    }

}
