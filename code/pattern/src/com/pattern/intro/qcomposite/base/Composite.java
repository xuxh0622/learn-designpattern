package com.pattern.intro.qcomposite.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储子部件
 * @author xuxhm
 *
 */
public class Composite extends Component{
	
	private List<Component> children = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component){
		children.add(component);
	}
	
	@Override
	public void remove(Component component){
		children.remove(component);
	}
	
	@Override
	public void display(){
		for(Component comp : children){
			comp.display();
		}
		System.out.println(name + " display");
	}
		
}
