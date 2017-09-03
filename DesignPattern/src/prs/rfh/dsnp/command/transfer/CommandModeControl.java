package prs.rfh.dsnp.command.transfer;




import java.util.Stack;

public class CommandModeControl implements Control {
	private Transable[] onCommands;
	private Transable[] offCommands;
	private Stack<Transable> stack=new Stack<Transable>();
	public CommandModeControl()
	{
		onCommands=new Transable[5];
		 offCommands=new Transable[5];

		Transable noCommand=new NoCommand();
		 
		 for(int i=0,len=onCommands.length;i<len;i++)
		 {
			 onCommands[i]=noCommand;
			 offCommands[i]=noCommand;
		 }
		 
	}
	
	public void setCommand(int slot,Transable onCommand,Transable offCommand)
	{
		onCommands[slot]=onCommand;
		 offCommands[slot]=offCommand;
		
	}

	@Override
	public void onButton(int slot) {
		
		onCommands[slot].execute();
		stack.push(onCommands[slot]);
	}

	@Override
	public void offButton(int slot) {
		
		offCommands[slot].execute();
		stack.push(offCommands[slot]);
	}

	@Override
	public void undoButton() {
		// TODO Auto-generated method stub
		stack.pop().undo();
	}

}
