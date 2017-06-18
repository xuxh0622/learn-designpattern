package com.pattern.intro.mfactory;
//数据库需要实现的方法
public interface IDepartment {
	void insert(Department department);
	
	Department getDepartment(int id);
}
