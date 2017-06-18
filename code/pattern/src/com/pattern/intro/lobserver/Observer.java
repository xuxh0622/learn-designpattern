package com.pattern.intro.lobserver;
//观察者抽象类，需要依赖通知者获取其中状态
public abstract class Observer {
	protected String name;
	protected Subject subject;
	public Observer(String name,Subject subject){
		this.name = name;
		this.subject = subject;
	}
	public abstract void update();
}
