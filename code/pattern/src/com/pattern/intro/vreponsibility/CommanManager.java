package com.pattern.intro.vreponsibility;

public class CommanManager extends Manager{

	public CommanManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.requestType.equals("请假") && request.num <= 2){
			System.out.println("CommanManager处理");
		}else if(superior != null){
			superior.requestApplications(request);
		}
	}

}
