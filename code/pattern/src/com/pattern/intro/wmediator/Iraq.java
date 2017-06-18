package com.pattern.intro.wmediator;
//伊拉克城市具体实现类，类似Conce热特Colleague2
public class Iraq extends Country{

	public Iraq(UnitedNations mediator) {
		super(mediator);
	}
	
	public void declare(String message){
		mediator.declare(message, this);
	}
	
	public void getMessage(String message){
		System.out.println("伊拉克获取对象确认信息" + message);
	}

}
