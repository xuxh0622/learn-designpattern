package com.pattern.intro.qcomposite.base;
/**
 * 在组合中表示叶子点对象，没有子节点
 * @author xuxhm
 *
 */
public class Leaf extends Component{
	
	public Leaf(String name) {
		super(name);
	}

	@Override
	public void display(){
		System.out.println(name + " display");
	}

	@Override
	public void add(Component component) {
		System.out.println(name + "add");
	}

	@Override
	public void remove(Component component) {
		System.out.println(name + "remove");
	}
}
