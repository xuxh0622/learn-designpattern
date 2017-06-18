package com.pattern.intro.lobserver.base;
//测试方法
public class Test {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver(subject);
		subject.attach(observer);
		subject.notifyObserver();
	}
}
