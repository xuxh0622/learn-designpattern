package com.pattern.intro.wmediator;

public class Test {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);
		UNSC.setColleague1(c1);
		UNSC.setColleague2(c2);
		c1.declare("不准研发核武器");
		c2.declare("没有核武器");
	}
}
