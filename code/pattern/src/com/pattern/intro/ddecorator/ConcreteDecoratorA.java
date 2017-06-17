package com.pattern.intro.ddecorator;

public class ConcreteDecoratorA extends Decorator{
	private String addedStateA;
	
	/**
	 * 首先运行Component方法，然后执行本类功能，对Component进行了装饰
	 */
	public void operation(){
		super.operation();
		System.out.println("ConcreteDecoratorA");
	}
}
