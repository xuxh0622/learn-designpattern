package com.pattern.intro.zvisitor;
//人抽象类，接收不同状态
public abstract class Person {
	public abstract void accept(Action action);
}
