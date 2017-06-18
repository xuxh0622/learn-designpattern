## 命令模式（Command）

**定义**：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。

**实例**：烤肉店点餐，下单，反馈功能。

**优点**：把请求一个操作的对象与知道怎么执行一个操作的对象分隔开。

```java
//命令
public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	//命令执行方法
	abstract public void execute();
}
//接收者，具体执行命令的类
public class Receiver {
	public void action(){
		System.out.println("执行请求");
	}
}
//要求该命令执行某个请求
public class Invoker {
	private Command command;
	public void setCommand(Command command){
		this.command = command;
	}
	public void executeCommand(){
		command.execute();
	}
}
//测试
public class Test {
	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();
		i.setCommand(c);
		i.executeCommand();
	}
}
```

![命令模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/ucommand.png)

![命令模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/ubasecommand.png)

