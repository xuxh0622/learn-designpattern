package com.pattern.intro.nstate;

public class Context {
	//当前访问对象
	public State newState;
	
	public Context(State newState){
		this.newState = newState;
	}
	//访问当前类状态，然后对象变更为下一个对象
	public void request(){
		newState.handle(this);
	}
}
