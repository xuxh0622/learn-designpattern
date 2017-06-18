package com.pattern.intro.nstate;

public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		System.out.println("ConcreteStateA");
		context.newState = new ConcreteStateB();
	}
}
