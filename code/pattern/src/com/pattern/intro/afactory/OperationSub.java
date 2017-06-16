package com.pattern.intro.afactory;

public class OperationSub extends Operation{

	@Override
	public double getResult() {
		return this.getNumberA() - this.getNumberB();
	}

}
