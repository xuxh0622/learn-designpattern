package com.pattern.intro.ddecorator;
/**
 * 装饰类
 * @author xuxhm
 *
 */
public class Decorator extends Component{
	
	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}

}
