package com.pattern.intro.ucommand;

import java.util.ArrayList;
import java.util.List;

//服务员
public class Waiter {
	private List<Command> orders = new ArrayList<Command>();
	public void setOrder(Command command){
		orders.add(command);
	}
	public void cancelOrder(Command command){
		orders.remove(command);
	}
	public void notifyCommand(){
		for(Command command:orders){
			command.executeCommand();
		}
	}
}
