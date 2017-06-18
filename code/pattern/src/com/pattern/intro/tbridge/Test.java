package com.pattern.intro.tbridge;

public class Test {
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
	}
}
