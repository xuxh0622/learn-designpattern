package com.pattern.intro.pmemento.base;
//管理者
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}
	//负责保存好备忘录Memento，不忘对备忘录的内容进行操作和检查
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
