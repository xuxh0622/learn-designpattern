package com.pattern.intro.wmediator.base;
//抽象中介者类
public abstract class Mediator {
	public abstract void send(String message,Colleague colleague);
}
