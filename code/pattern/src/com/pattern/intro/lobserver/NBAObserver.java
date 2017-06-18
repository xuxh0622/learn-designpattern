package com.pattern.intro.lobserver;

public class NBAObserver extends Observer{
	public NBAObserver(String name,Subject subject) {
		super(name,subject);
	}

	@Override
	public void update() {
		System.out.println("关闭NBA");
	}

}
