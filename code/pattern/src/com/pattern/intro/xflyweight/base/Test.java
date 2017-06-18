package com.pattern.intro.xflyweight.base;

public class Test {
	public static void main(String[] args) {
		FlyweidhtFactory f = new FlyweidhtFactory();
		Flyweight fx = f.getFlyweight("X");
		fx.operation(10);
		UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(20);
	}
}
