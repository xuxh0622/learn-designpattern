## 适配器模式（Adapter）

**定义**：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原来由于接口不兼容而不能一起工作的那些类可以一起工作。

**实例**：姚明去国外打篮球，需要Adapter适配翻译才能听懂Target教练的战术。

**使用场景**：系统的数据和行为都正确，但接口不符时，我们考虑适配器，目的是使控制范围之外的一个原有对象与某个接口匹配。希望复用一些现存的类，但是接口又与复用环境要求不一致的情况。

```java
//客户期待的接口
public abstract class Target {
	public void request(){
		System.out.println("普通请求");
	}
}
//适配器，把原接口方法转为目标接口方法
public class Adapter extends Target{
	private Adaptee adaptee = new Adaptee();
	public void request(){
		adaptee.specificRequest();
	}
}
//需要适配的类
public class Adaptee {
	public void specificRequest(){
		System.out.println("需要适配的请求");
	}
}
//测试类
public class Test {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
```

**当前实例结构图**

![状态模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/oadapter.png)

**适配器模式结构图**

![状态模式结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/obaseadapter.png)