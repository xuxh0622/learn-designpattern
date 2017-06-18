package com.pattern.intro.vreponsibility.base;
//具体处理类
public class ConcreteHandlerA extends Handler{

	@Override
	public void handlerRequest(int request) {
		if(request >= 0){
			System.out.print("ConcreteHandlerA处理请求");
		}else if(successor != null){
			successor.handlerRequest(request);
		}
	}

}
