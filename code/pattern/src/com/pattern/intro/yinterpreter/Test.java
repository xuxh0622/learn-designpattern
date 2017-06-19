package com.pattern.intro.yinterpreter;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		for(AbstractExpression exp: list){
			exp.interpret(context);
		}
	}
}
