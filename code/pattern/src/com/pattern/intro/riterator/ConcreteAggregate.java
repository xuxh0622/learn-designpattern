package com.pattern.intro.riterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
	
	private List<Object> items = new ArrayList<Object>();
	
	public int count(){
		return items.size();
	}
	
	public Object get(int index){
		return items.get(index);
	}
	
	public void add(Object object){
		items.add(object);
	}
}
