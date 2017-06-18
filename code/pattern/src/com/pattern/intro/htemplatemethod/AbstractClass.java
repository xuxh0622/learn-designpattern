package com.pattern.intro.htemplatemethod;

//抽象类模板，定义并实现了一个模板方法
public abstract class AbstractClass {
	public void TemplateMethod(){
		primitiveOperation1();
		System.out.println("center");
		primitiveOperation2();
	}
	
	public abstract void primitiveOperation1();
	
	public abstract void primitiveOperation2();
}
