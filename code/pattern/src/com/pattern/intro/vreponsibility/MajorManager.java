package com.pattern.intro.vreponsibility;

public class MajorManager extends Manager{

	public MajorManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.requestType.equals("请假") && request.num > 2){
			System.out.println("MajorManager处理");
		}else if(superior != null){
			superior.requestApplications(request);
		}
	}

}
