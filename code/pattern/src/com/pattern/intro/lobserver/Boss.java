package com.pattern.intro.lobserver;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	//通知类变化
	@Override
	public void notifyObserver() {
		for(Observer observer : observers){
			observer.update();
		}
	}

}
