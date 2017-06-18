package com.pattern.intro.xflyweight.base;
//不需要共享的Flyweight
public class UnsharedConcreteFlyweight implements Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("UnsharedConcreteFlyweight" + extrinsicstate);
	}

}
