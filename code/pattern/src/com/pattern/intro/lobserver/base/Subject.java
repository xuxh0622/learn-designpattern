package com.pattern.intro.lobserver.base;

import java.util.ArrayList;
import java.util.List;

//通知者抽象类
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	//被观察者观察的状态
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
		
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void dettach(Observer observer){
		observers.remove(observer);
	}
	//通知观察者
	public void notifyObserver(){
		for(Observer observer : observers){
			observer.update();
		}
	}
}


