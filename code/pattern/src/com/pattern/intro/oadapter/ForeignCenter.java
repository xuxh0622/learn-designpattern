package com.pattern.intro.oadapter;
//外籍中锋
public class ForeignCenter {
	
	private String name;

	public ForeignCenter(String name) {
		this.name = name;
	}

	public void foreignAttach(){
		System.out.println(name + "外籍中锋进攻");
	}
	
	public void foreignDefense(){
		System.out.println(name + "外籍中锋防守");
	}
}
