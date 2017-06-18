package com.pattern.intro.oadapter;

public class Test {
	public static void main(String[] args) {
		Player a = new Forwards("巴蒂尔");
		a.attach();
		Player b = new Translator("姚明");
		b.attach();
	}
}
