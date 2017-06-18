package com.pattern.intro.mfactory;
//测试
public class Test {
	public static void main(String[] args) {
		IDepartment department = DataAccess.createDepartment();
		department.insert(null);
	}
}
