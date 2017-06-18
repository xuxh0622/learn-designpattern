package com.pattern.intro.ifacade;
//外观模式封装类
public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
	}
	
	public void methodA(){
		System.out.println("Facade-methodA");
		one.methodOne();
		two.methodTwo();
	}
}
