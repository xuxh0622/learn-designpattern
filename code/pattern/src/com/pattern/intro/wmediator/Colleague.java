package com.pattern.intro.wmediator;
//抽象同事类，认识抽象中介者
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
