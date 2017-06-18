package com.pattern.intro.wmediator;

public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void notifyMessage(String message){
		System.out.println("ConcreteColleague1");
	}
	
	public void send(String message){
		mediator.send(message, this);
	}
}
