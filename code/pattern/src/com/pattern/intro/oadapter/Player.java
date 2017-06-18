package com.pattern.intro.oadapter;
//球员类
public abstract class Player {
	protected String name;
	
	public Player(String name){
		this.name = name;
	}
	//进攻
	public abstract void attach();
	//防守
	public abstract void defense();
}
