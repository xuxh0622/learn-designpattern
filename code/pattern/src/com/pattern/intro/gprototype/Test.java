package com.pattern.intro.gprototype;
//测试类
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume a = new Resume("test1");
		a.setPersonalInfo(17);
		a.setWorkExperience("第一份");
		
		Resume b = (Resume) a.clone();
		b.setPersonalInfo(20);
		b.setWorkExperience("第二份");
		
		a.display();
		b.display();
	}
}
