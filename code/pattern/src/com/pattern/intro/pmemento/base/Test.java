package com.pattern.intro.pmemento.base;

public class Test {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("on");
		o.show();
		//备忘录执行
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		//修改状态
		o.setState("off");
		o.show();
		//恢复刚才状态
		o.setMemento(c.getMemento());
		o.show();
	}
}
