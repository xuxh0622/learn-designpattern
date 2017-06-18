package com.pattern.intro.vreponsibility.base;
//处理请求的抽象类
public abstract class Handler {
	protected Handler successor;
	
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	public abstract void handlerRequest(int request);
}
