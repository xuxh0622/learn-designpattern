package com.pattern.intro.yinterpreter.base;
//表达式
public abstract class AbstractExpression {
	//处理输入，以O开头音阶，以其他开头音符
	public void interpretor(PlayContext context){
		
	}
	
	public abstract void excute(String key,double value);
}
