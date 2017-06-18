package com.pattern.intro.ucommand;
//烤鸡肉命令
public class BakeChickenComamnd extends Command{

	public BakeChickenComamnd(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void executeCommand() {
		receiver.bakeChicken();
	}

}
