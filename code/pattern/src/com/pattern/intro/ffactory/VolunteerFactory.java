package com.pattern.intro.ffactory;

public class VolunteerFactory implements IFactory{

	@Override
	public LeiFeng createLeifeng() {
		return new Volunteer();
	}

}
