package com.pattern.intro.wmediator.ba;
//城市具体实现类，类似Conce热特Colleague1
public class USA extends Country{

	public USA(UnitedNations mediator) {
		super(mediator);
	}
	
	public void declare(String message){
		mediator.declare(message, this);
	}
	
	public void getMessage(String message){
		System.out.println("美国获取对象确认信息" + message);
	}

}
