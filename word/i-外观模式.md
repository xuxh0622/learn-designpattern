## 外观模式（Facade）

**定义**：为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

**实例**：Client（客户）买股票，通过Fund（基金）购买Stock（股票），就不用关心太多细节。

**使用场景**：设计初期阶段，有意识把不同层分离，比如三层架构表示层、业务逻辑层和数据访问层建立外观模式。其次在开发阶段，子系统因为不断的重构演化变得越来越复杂，增加外观模式提供简单接口，减少依赖。在维护遗留大型系统时，可能这个系统已经非常难以维护或扩展了，让新系统与外观对象交互，减少与遗留代码交互的复杂工作。

```java
//外观模式调用类
public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
	}
	public void methodA(){
		System.out.println("Facade-methodA");
		one.methodOne();
		two.methodTwo();
	}
}
//测试类
public class Test {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
	}
}
```



![模板方法模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/ifacade.png)