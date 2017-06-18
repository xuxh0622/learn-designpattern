package com.pattern.intro.pmemento.base;
/**
 * 备忘录：负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento
 * 把需要保存的细节封装其中，不影响客户端
 * @author xuxhm
 *
 */
public class Memento {
	private String state;
	
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Memento(String state){
		this.state = state;
	}
}
