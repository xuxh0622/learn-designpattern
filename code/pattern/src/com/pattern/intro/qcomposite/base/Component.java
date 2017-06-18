package com.pattern.intro.qcomposite.base;
/**
 * 组合中对象声明接口，用于访问和管理Component的子部件
 * @author xuxhm
 *
 */
public abstract class Component {
	
	protected String name;
	
	public Component(String name){
		this.name = name;
	}
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract void display();
}
