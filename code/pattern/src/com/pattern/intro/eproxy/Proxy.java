package com.pattern.intro.eproxy;
/**
 * 代理
 * @author xuxhm
 *
 */
public class Proxy implements GiveGift{
	
	private Pursuit pursuit;
	
	public Proxy(SchoolGirl schoolGirl){
		this.pursuit = new Pursuit(schoolGirl);
	}

	@Override
	public void GiveDolls() {
		pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		pursuit.GiveFlowers();
	}
	
	
}

