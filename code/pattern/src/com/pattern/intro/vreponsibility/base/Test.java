package com.pattern.intro.vreponsibility.base;

public class Test {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandlerA();
		Handler h2 = new ConcreteHandlerB();
		h1.setSuccessor(h2);
		h1.handlerRequest(-3);
	}
}
