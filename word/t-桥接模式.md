## 桥接模式（Bridge）

**定义**：尽量使用合成/聚合，尽量不要使用类继承。实现系统可能有多角度分类，每一种分类有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合。

**实例**：手机硬件和软件系统。

```java
//实现类
public abstract class Implementor {
	public abstract void operation();
}
//抽象类
public class Abstraction {
	protected Implementor implementor;
	public void setImplementor(Implementor implementor){
		this.implementor = implementor;
	}
	public void operation(){
		implementor.operation();
	}
}
//测试
public class Test {
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
	}
}
```

![备忘录结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/tbridge.png)

![备忘录结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/tbasebridge.png)