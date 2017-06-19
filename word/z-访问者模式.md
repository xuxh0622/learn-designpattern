## 访问者模式（Visitor）

**定义**：表示一个作用于某对象结构中的各元素的操作。它是你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

**实例**：男人女人在不同事情上的状态反应。

**优点**：把数据接口和操作分开，使得增加新的操作很容易，因为增肌一个新的操作意味着增加一个新的访问者，访问者模式将有关的行为集中到一个访问对象中。

**缺点**：增加新的数据结构变得困难。

```java
//状态抽象类
public interface Action {
	public void getManConclusion(Man man);
	public void getWomanConclusion(Woman woman);
}
//人抽象类，接收不同状态
public abstract class Person {
	public abstract void accept(Action action);
}
//访问结构
public class ObjectStructure {
	private List<Person> elements = new ArrayList<Person>();
	
	public void attach(Person element){
		elements.add(element);
	}
	
	public void display(Action visitor){
		for(Person person:elements){
			person.accept(visitor);
		}
	}
}
//测试
public class Test {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		Success v1 = new Success();
		o.display(v1);
	}
}
```

![结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/zvisitor.png)

![结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/zbasevisitor.png)