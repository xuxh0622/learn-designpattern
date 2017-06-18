package com.pattern.intro.ffactory;
/**
 * 测试类
 * @author xuxhm
 *
 */
public class Test {
	public static void main(String[] args) {
		LeiFeng student = new UndergraduateFactory().createLeifeng();
		student.BuyRice();
	}
}
