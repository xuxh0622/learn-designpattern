package com.pattern.intro.zvisitor;

public class Success implements Action{

	@Override
	public void getManConclusion(Man man) {
		System.out.println("背后有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println("背后有一个不成功的男人");
	}

}
