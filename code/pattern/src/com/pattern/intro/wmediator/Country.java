package com.pattern.intro.wmediator;
//城市，类似模式中Colleague抽象同事类
public class Country {
	protected UnitedNations mediator;
	
	public Country(UnitedNations mediator){
		this.mediator = mediator;
	}
}
