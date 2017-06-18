package com.pattern.intro.ucommand.base;

public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
	}
	
}
