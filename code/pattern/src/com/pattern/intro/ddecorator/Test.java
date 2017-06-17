package com.pattern.intro.ddecorator;

public class Test {
	
	public static void main(String[] args) {
		ConcreteComponent a = new ConcreteComponent();
		/**
		 * 继承装饰类Decorator，装饰类继承Component包含接口方法，本类对Componnet接口方法进行装饰
		 */
		ConcreteDecoratorA b= new ConcreteDecoratorA();
		ConcreteDecoratorB c = new ConcreteDecoratorB();
		
		b.setComponent(a);
		c.setComponent(b);
		c.operation();
	}

}
