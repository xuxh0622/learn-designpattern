package com.pattern.intro.wmediator.base;

public class Test {
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		m.setColleague1(c1);
		m.setColleague2(c2);
		c1.send("吃过饭了吗");
	}
}
