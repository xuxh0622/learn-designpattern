package com.pattern.intro.afactory;
/**
 * 简单工厂模式
 * @author xuxhm
 *
 */
public class TestFactory {
	public static void main(String[] args) {
		Operation oper = OperationFactory.createOperate('+');
		oper.setNumberA(10);
		oper.setNumberB(20);
		System.out.println(oper.getResult());
	}
}
