## UML图

```java
//继承类Animal：is-a动物
//实现IFly：实现其中方法
public class Penguin extends Animal implements IFly{
	//关联Climate：当一个类需要知道另一个类的变化
	private Climate climate;
  	private Foot foot;
	//组合Foot：强的拥有关系，部分和整体的关系，脚是企鹅的一部分
	public Penguin(Foot foot){
		this.foot = foot;
	}
	//依赖Oxygen：其中一些行为依赖其他类
	public void Metabolism(Oxygen oxygen){
	}
}
public class PenguinAggregate {
	//聚合Penguin：弱的拥有关系，企鹅群拥有企鹅，但是企鹅不是企鹅群不可分割的一部分
	private Penguin[] arrayPenguin;
}
```

![依赖dependency](https://github.com/xuxh0622/learn-designpattern/blob/master/image/auml.png)

## 简单工厂模式

```java
/**
 * 简单工厂方法获取操作对象
 * @author xuxhm
 *
 */
public class OperationFactory {
	public static Operation createOperate(char operate){
		Operation oper = null;
		switch(operate){
		case '+':
			oper = new OperationAdd();
			break;
		case '-':
			oper = new OperationSub();
			break;
		}
		return oper;
	}
}
```

![依赖dependency](https://github.com/xuxh0622/learn-designpattern/blob/master/image/afactory.png)