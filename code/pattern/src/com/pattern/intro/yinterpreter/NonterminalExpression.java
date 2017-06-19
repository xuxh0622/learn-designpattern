package com.pattern.intro.yinterpreter;

public class NonterminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("非终结符解释器");
	}

}
