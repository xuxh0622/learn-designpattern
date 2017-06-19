package com.pattern.intro.zvisitor;

public class Man extends Person{

	@Override
	public void accept(Action action) {
		action.getManConclusion(this);
	}

}
