package com.pattern.intro.lobserver;

public class StockObserver extends Observer{

	public StockObserver(String name,Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println("关闭股票");
	}

}
