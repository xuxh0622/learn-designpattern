## 工厂方法模式

**定义**：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。

**实例**：Leifen（雷锋）做好事，现在有Volunteer（社区志愿者）、大学生（Undergraduate）继承Leifen做好事。

**优缺点**：工厂方法模式使用多态性，克服了简单工厂违背开放-封闭原则的缺点，又保持了封装对象过程的有点。但缺点是每加一个产品，就需要添加一个产品工厂的类，增加了额外的开发量。

```java
//工厂方法
public class UndergraduateFactory implements IFactory{
	@Override
	public LeiFeng createLeifeng() {
		return new Undergraduate();
	}
}
public class Test {
	public static void main(String[] args) {
		LeiFeng student = new UndergraduateFactory().createLeifeng();
		student.BuyRice();
	}
}
```

![工厂方法模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/ffactory.png)