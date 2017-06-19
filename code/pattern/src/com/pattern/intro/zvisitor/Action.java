package com.pattern.intro.zvisitor;
//状态抽象类
public interface Action {
	public void getManConclusion(Man man);
	public void getWomanConclusion(Woman woman);
}

