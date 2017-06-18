## 中介者模式（Mediator）

**定义**：用一个中介对象来封装一系列的对象交互。中介者使对象不需要显示地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

**缺点**：由于ConcreteMediator控制了集中化，于是就把交互复杂性交给了中介者的复杂性，这就使得中介者变得比任何一个ConcreteColleague都复杂。

**使用场景**：应用于一组对象以定义良好但是复杂的方式进行通信的场合。

```java
//抽象同事类，认识抽象中介者
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
//其中一个同事类
public class ConcreteColleague1 extends Colleague{
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	public void notifyMessage(String message){
		System.out.println("ConcreteColleague1");
	}
	public void send(String message){
		mediator.send(message, this);
	}
}
//抽象中介者类
public abstract class Mediator {
	public abstract void send(String message,Colleague colleague);
}
//中介类具体实现类
public class ConcreteMediator extends Mediator{
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;
	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}
	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}
    //这个方法进行交互
	@Override
	public void send(String message, Colleague colleague) {
		if(colleague == colleague1){
			colleague2.notifyMessage(message);
		}else{
			colleague1.notifyMessage(message);
		}
	}
}
//测试
public class Test {
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		m.setColleague1(c1);
		m.setColleague2(c2);
		c1.send("吃过饭了吗");
	}
}
```

![命令模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/wmediator.png)

![命令模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/wasemediator.png)