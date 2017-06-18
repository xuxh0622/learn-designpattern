package com.pattern.intro.ucommand.base;
//命令
public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	//命令执行方法
	abstract public void execute();
}
