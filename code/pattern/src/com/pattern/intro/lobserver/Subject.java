package com.pattern.intro.lobserver;
//通知类抽象，依赖观察者，通知其变化
public interface Subject {
	void attach(Observer observer);
	void detach(Observer observer);
	void notifyObserver();
}
