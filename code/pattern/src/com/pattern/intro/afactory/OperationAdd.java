package com.pattern.intro.afactory;
/**
 * 事项加法操作
 * @author xuxhm
 *
 */
public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		return this.getNumberA() + this.getNumberB();
	}

}
