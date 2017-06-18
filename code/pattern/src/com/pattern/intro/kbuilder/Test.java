package com.pattern.intro.kbuilder;
/**
 * Builder指挥者用ConcreteBuilder1构建产品
 * 具体步骤在construct组装好
 * @author xuxhm
 */
public class Test {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
	}
}
