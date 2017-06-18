## 状态模式（State）

**定义**：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。

**实例**：工作状态上午精神，下午慢慢犯困，晚上加班。

**使用场景**：当一个对象状态转换的条件表达式过于复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类中，可以把复杂的判断逻辑简化。

**优点**：将特定的状态相关的行为都放入一个对象中，由于所有与状态相关的代码都存在于某个具体实现类中，所以可能通过新的子类可以很容易增加新的状态和转换。

```java
public class Context {
	//当前访问对象
	public State newState;
	
	public Context(State newState){
		this.newState = newState;
	}
	//访问当前类状态，然后对象变更为下一个对象
	public void request(){
		newState.handle(this);
	}
}
//具体状态变化类
public class ConcreteStateA extends State{
	@Override
	public void handle(Context context) {
		System.out.println("ConcreteStateA");
		context.newState = new ConcreteStateB();
	}
}
//测试类
public class Test {
	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		c.request();
		c.request();
	}
}
```

**当前实例结构图**

![状态模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/nstate.png)

**状态模式结构图**

![状态模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/nbasestate.png)