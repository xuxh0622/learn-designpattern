package com.pattern.intro.vreponsibility;
//管理者类似职责链中Handler
public abstract class Manager {
	protected String name;
	
	protected Manager superior;
	
	public Manager(String name){
		this.name = name;
	}
	//设置上级类
	public void setSuperior(Manager superior){
		this.superior = superior;
	}
	//申请请求
	public abstract void requestApplications(Request request);
}
