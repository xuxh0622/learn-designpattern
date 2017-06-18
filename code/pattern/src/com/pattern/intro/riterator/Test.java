package com.pattern.intro.riterator;

public class Test {
	
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.add("大鸟");
		a.add("小菜");
		a.add("行李");
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem());
			i.next();
		}
	}
}
