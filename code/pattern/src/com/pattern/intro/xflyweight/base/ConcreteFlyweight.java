package com.pattern.intro.xflyweight.base;

public class ConcreteFlyweight implements Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("ConcreteFlyweight" + extrinsicstate);
	}

}
