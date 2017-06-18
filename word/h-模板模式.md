## 模板方法模式（TemplateMethod）

**定义**：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

**描述**：通过把不变行为搬移到超类，去除子类中的重复代码来体现它的优势。

**实例**：TestPaper试卷作为模板，Student学生抄卷子，然后开始答题。

```java
//抽象类模板，定义并实现了一个模板方法
public abstract class AbstractClass {
	public void TemplateMethod(){
		primitiveOperation1();
		System.out.println("center");
		primitiveOperation2();
	}
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
}
//子类
public class ConcreteClassA extends AbstractClass{
	@Override
	public void primitiveOperation1() {
		System.out.println("primitiveOperation1 start");	
    }
	@Override
	public void primitiveOperation2() {
		System.out.println("primitiveOperation1 end");
	}
}
//测试类
public class Test {
	public static void main(String[] args) {
		AbstractClass a = new ConcreteClassA();
		a.TemplateMethod();
		
		AbstractClass b = new ConcreteClassB();
		b.TemplateMethod();
	}
}
```

![模板方法模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/htemplatemethod.png)

