package com.pattern.intro.nstate;

public class ConcreteStateB extends State{

	@Override
	public void handle(Context context) {
		System.out.println("ConcreteStateB");
	}

}
