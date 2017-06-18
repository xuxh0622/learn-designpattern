package com.pattern.intro.ucommand;
//烤羊肉串命令
public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void executeCommand() {
		receiver.bakeMutton();
	}

}
