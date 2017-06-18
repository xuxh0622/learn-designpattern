package com.pattern.intro.riterator;
//定义迭代对象
public abstract class Iterator {
	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentItem();
}
