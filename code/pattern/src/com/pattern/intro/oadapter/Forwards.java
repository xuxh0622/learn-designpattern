package com.pattern.intro.oadapter;
//前锋
public class Forwards extends Player{

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attach() {
		System.out.println(name + "前锋进攻");
	}

	@Override
	public void defense() {
		System.out.println(name + "前锋防守");
	}

}
