package com.pattern.intro.xflyweight.base;
//具体享元类的超类，通过这个接口，Flyweight可以接受并作用于外部状态
public interface Flyweight {
	void operation(int extrinsicstate);
}
