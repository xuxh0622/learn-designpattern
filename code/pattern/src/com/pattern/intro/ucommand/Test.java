package com.pattern.intro.ucommand;

public class Test {
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand = new BakeMuttonCommand(boy);
		Command bakeChickenCommand = new BakeChickenComamnd(boy);
		Waiter girl = new Waiter();
		girl.setOrder(bakeMuttonCommand);
		girl.setOrder(bakeChickenCommand);
		girl.notifyCommand();
	}
}
