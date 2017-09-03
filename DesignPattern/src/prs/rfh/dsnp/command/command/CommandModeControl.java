package prs.rfh.dsnp.command.command;


import prs.rfh.dsnp.command.Control;
import prs.rfh.dsnp.command.transfer.NoCommand;
import prs.rfh.dsnp.command.transfer.Transable;

import java.util.Stack;

public class CommandModeControl implements Control {
	private Transable[] onCommands;
	private Stack<Transable> stack=new Stack<Transable>();
	public CommandModeControl()
	{
		onCommands=new Transable[5];

		Transable noCommand=new NoCommand();
		 
		 for(int i=0,len=onCommands.length;i<len;i++)
		 {
			 onCommands[i]=noCommand;
		 }
		 
	}
	
	public void setCommand(int slot,Transable onCommand)
	{
		onCommands[slot]=onCommand;

	}

	@Override
	public void onButton(int slot) {
		
		onCommands[slot].execute();
		stack.push(onCommands[slot]);
	}



	@Override
	public void undoButton() {
		// TODO Auto-generated method stub
		stack.pop().undo();
	}

}
