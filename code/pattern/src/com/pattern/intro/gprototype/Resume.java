package com.pattern.intro.gprototype;
//简历实现Cloneable克隆类，然后实现
public class Resume implements Cloneable{
	private String name;
	private int age;
	private WorkExperience workExperience;
	
	public Resume(String name){
		this.name = name;
		workExperience = new WorkExperience();
	}
	
	public Resume(WorkExperience work) throws CloneNotSupportedException{
		this.workExperience = (WorkExperience)work.clone();
	}
	
	//设置基本信息
	public void setPersonalInfo(int age){
		this.age = age;
	}
	
	//设置工作经验
	public void setWorkExperience(String workInfo){
		workExperience.setWorkInfo(workInfo);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume obj = new Resume(this.workExperience);
		obj.name = this.name;
		obj.age = this.age;
		return obj;
	}
	
	public void display(){
		System.out.println(name + age + workExperience.getWorkInfo());
	}
	
}
