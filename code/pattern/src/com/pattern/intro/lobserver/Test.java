package com.pattern.intro.lobserver;

public class Test {
	public static void main(String[] args) {
		Boss boss = new Boss();
		StockObserver observer1 = new StockObserver("test1", boss);
		NBAObserver observer2 = new NBAObserver("test2", boss);
		boss.attach(observer1);
		boss.attach(observer2);
		boss.notifyObserver();
	}
}
