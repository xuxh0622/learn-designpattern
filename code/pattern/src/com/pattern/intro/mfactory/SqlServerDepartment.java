package com.pattern.intro.mfactory;

public class SqlServerDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("SqlServerDepartment+insert");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("SqlServerDepartment+getDepartment");
		return null;
	}

}
