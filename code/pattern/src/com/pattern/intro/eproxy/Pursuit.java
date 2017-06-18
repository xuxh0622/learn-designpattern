package com.pattern.intro.eproxy;
/**
 * 追求者 
 * @author xuxhm
 *
 */
public class Pursuit implements GiveGift{
	
	private SchoolGirl schoolGirl;
	
	public Pursuit(SchoolGirl schoolGirl){
		this.schoolGirl = schoolGirl;
	}

	@Override
	public void GiveDolls() {
		System.out.println(schoolGirl.getName() + "dolls");
	}

	@Override
	public void GiveFlowers() {
		System.out.println(schoolGirl.getName() + "flowers");
	}
	
}
