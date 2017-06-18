package com.pattern.intro.pmemento.base;
//发起者
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	//负责创建一个备忘录Memento，用以记录当前时刻它的内部状态
	public Memento createMemento(){
		return new Memento(state);
	}
	//并可使用备忘录恢复内部状态
	public void setMemento(Memento memento){
		this.state = memento.getState();
	}
	public void show(){
		System.out.println(state);
	}
}
