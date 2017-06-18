package com.pattern.intro.lobserver.base;
//具体观察者
public class ConcreteObserver extends Observer{
	//依赖通知者，需要知道里面状态变化情况
	public ConcreteObserver(Subject subject) {
		super(subject);
	}
	@Override
	public void update() {
		System.out.println(subject.getState() + "观察者更新");
	}
}
