package com.pattern.intro.pmemento;
//游戏角色：发起者类
public class GameRole {
	private int vit;
	private int atk;
	private int def;
	//初始化角色值
	public GameRole(){
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	//备份备忘录
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vit,atk,def);
	}
	//恢复备忘录
	public void recoveryState(RoleStateMemento memento){
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}
	public void fight(){
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	public void display(){
		System.out.println(this.vit + this.atk + this.def);
	}
}
