策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式算法的变化，不会影响到使用算法的客户。

![依赖dependency](https://github.com/xuxh0622/learn-designpattern/blob/master/image/bstrategy.png)

```java
/**
 * 策略模式和简单工厂模式结合
 * @author xuxhm
 *
 */
public class Context {
	//聚合策略对象
	private Strategy strategy;
	
	public Context(char type){
		switch(type){
			case 'A':
				strategy = new ConcreteStrategyA();
				break;
			case 'B':
				strategy = new ConcreteStrategyB();
				break;
		}
	}
	
	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
}
```

