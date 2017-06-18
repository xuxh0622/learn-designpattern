package com.pattern.intro.mfactory;

public class OracleDepartment implements IDepartment{
	@Override
	public void insert(Department department) {
		System.out.println("OracleDepartment+insert");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("OracleDepartment+getDepartment");
		return null;
	}

}
