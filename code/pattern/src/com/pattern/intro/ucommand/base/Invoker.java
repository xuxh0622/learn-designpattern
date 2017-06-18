package com.pattern.intro.ucommand.base;
//要求该命令执行某个请求
public class Invoker {
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void executeCommand(){
		command.execute();
	}
}
