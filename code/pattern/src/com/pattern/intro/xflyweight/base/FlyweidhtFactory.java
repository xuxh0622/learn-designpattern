package com.pattern.intro.xflyweight.base;

import java.util.Hashtable;

//享元工厂，用来创建并管理Flyweight对象
public class FlyweidhtFactory {
	private Hashtable<String,Flyweight> flyweights = new Hashtable<String,Flyweight>();	
	public FlyweidhtFactory(){
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key){
		return flyweights.get(key);
	}
}
