package com.pattern.intro.ffactory;

public class UndergraduateFactory implements IFactory{
	@Override
	public LeiFeng createLeifeng() {
		return new Undergraduate();
	}
}
