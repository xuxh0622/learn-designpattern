package com.pattern.intro.wmediator;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void notifyMessage(String message){
		System.out.println("ConcreteColleague2");
	}
	public void send(String message){
		mediator.send(message, this);
	}
}
