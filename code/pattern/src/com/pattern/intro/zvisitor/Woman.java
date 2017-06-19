package com.pattern.intro.zvisitor;

public class Woman extends Person{

	@Override
	public void accept(Action action) {
		action.getWomanConclusion(this);
	}

}
