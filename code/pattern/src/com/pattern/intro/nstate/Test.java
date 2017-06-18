package com.pattern.intro.nstate;

public class Test {
	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		c.request();
		c.request();
	}
}
