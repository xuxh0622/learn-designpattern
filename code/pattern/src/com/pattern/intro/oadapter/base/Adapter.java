package com.pattern.intro.oadapter.base;
//适配器，把原接口方法转为目标接口方法
public class Adapter extends Target{
	private Adaptee adaptee = new Adaptee();
	public void request(){
		adaptee.specificRequest();
	}
}
