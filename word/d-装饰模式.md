装饰模式：动态地给一个对象添加一些额外的职责，就增强功能来说，装饰模式比生成子类更为灵活。

![装饰模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/ddecorator.png)

```java
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

public static void main(String[] args) {
		ConcreteComponent a = new ConcreteComponent();
		/**
		 * 继承装饰类Decorator，Decorator继承Component包含接口方法
		 * 本类对Componnet接口方法进行装饰
		 */
		ConcreteDecoratorA b= new ConcreteDecoratorA();
		ConcreteDecoratorB c = new ConcreteDecoratorB();
		
		b.setComponent(a);
		c.setComponent(b);
		c.operation();
	}

```

