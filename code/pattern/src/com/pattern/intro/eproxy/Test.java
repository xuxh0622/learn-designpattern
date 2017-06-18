package com.pattern.intro.eproxy;
/**
 * 追求者Pursuit追求SchoolGirl，通过Proxy办理，实际调用追求者方法
 * @author xuxhm
 *
 */
public class Test {
	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl("test");
		Proxy proxy = new Proxy(schoolGirl);
		proxy.GiveDolls();
		proxy.GiveFlowers();
	}
}
