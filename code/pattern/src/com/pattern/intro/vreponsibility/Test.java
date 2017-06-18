package com.pattern.intro.vreponsibility;

public class Test {
	public static void main(String[] args) {
		CommanManager manager1 = new CommanManager("");
		MajorManager manager2 = new MajorManager("");
		manager1.setSuperior(manager2);
		Request request = new Request();
		request.requestType = "请假";
		request.num = 3;
		manager1.requestApplications(request);
	}
}
