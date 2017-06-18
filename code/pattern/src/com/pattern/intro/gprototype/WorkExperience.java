package com.pattern.intro.gprototype;
//工作经历，测试深拷贝
public class WorkExperience implements Cloneable{
	private String workInfo;

	public String getWorkInfo() {
		return workInfo;
	}

	public void setWorkInfo(String workInfo) {
		this.workInfo = workInfo;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
