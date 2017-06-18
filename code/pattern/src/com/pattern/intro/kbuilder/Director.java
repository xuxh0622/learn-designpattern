package com.pattern.intro.kbuilder;
//控制者封装表示
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
