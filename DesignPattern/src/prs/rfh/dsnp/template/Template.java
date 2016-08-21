package prs.rfh.dsnp.template;

public abstract class Template {

	public void update(){
		System.out.println("开始打印");
		for(int i=0;i<10;i++){
			print();
		}
	}
	
	abstract void print();
	
}
