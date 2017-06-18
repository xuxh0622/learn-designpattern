package com.pattern.intro.vreponsibility.base;
//具体处理类
public class ConcreteHandlerB extends Handler{

	@Override
	public void handlerRequest(int request) {
		if(request < 0){
			System.out.print("ConcreteHandlerB处理请求");
		}else if(successor != null){
			successor.handlerRequest(request);
		}
	}

}
