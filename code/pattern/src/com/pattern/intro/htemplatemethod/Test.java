package com.pattern.intro.htemplatemethod;
//测试类
public class Test {
	public static void main(String[] args) {
		AbstractClass a = new ConcreteClassA();
		a.TemplateMethod();
		
		AbstractClass b = new ConcreteClassB();
		b.TemplateMethod();
	}
}
