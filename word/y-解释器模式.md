## 解释器模式（Interpreter）

**定义**：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

**使用场景**：正则表达式、浏览器解释HTML。当有一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时，可用解释器模式。

```java
//解释器抽象类
public abstract class AbstractExpression {
	public abstract void interpret(Context context);
}
//测试选择执行哪个解释器
public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		for(AbstractExpression exp: list){
			exp.interpret(context);
		}
	}
}
```



![结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/yinterpreter.png)

![结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/ybaseinterpreter.png)