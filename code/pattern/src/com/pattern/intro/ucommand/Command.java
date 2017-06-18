package com.pattern.intro.ucommand;

public abstract class Command {
	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver){
		this.receiver = receiver;
	}
	
	public abstract void executeCommand();
}
