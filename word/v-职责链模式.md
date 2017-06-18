## 职责链模式（Chain of Responsibility）

**定义**：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象炼成一条链，并沿着这条链传递该请求，知道有一个对象处理它为止。

**实例**：公司加薪、请求请求领导批准。

**优点**：即时增加或修改处理一个请求的结构，增强了给对象指派职责的灵活性。

```java
//处理请求的抽象类
public abstract class Handler {
	protected Handler successor;
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	public abstract void handlerRequest(int request);
}
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
//测试
public class Test {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandlerA();
		Handler h2 = new ConcreteHandlerB();
		h1.setSuccessor(h2);
		h1.handlerRequest(-3);
	}
}
```

![命令模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/vreponsility.png)

![命令模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/vbasereponsility.png)