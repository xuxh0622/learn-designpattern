package com.pattern.intro.lobserver.base;
//观察者抽象类
public abstract class Observer {
	
	protected Subject subject;
	
	public Observer(Subject subject){
		this.subject = subject;
	}
	public abstract void update();
}
