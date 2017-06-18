## 建造者模式（Builder）

**定义**：将一个复杂对象的构建和它的表示分离，使得同样的构建过程可以创建不同的表示。

**实例**：Builder是为创建一个Product对象的各个部件指定的抽象接口，ConcreteBuilder是具体建造者，构造和装配各个部件，Director是指挥者，构建一个使用Builder接口的对象。

**使用场景**：在创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方法时适用的模式。

```java
//控制者封装构建步骤
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
//抽象建造者类，确定产品由两个部件PartA与PartB组成，并声明一个得到产品建造后结果的方法getResult
public abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
//构建产品
public class ConcreteBuilder1 extends Builder{
	private Product product = new Product();
	@Override
	public void buildPartA() {
		product.add("部件A");
	}
	@Override
	public void buildPartB() {
		product.add("部件B");
	}
	@Override
	public Product getResult() {
		return product;
	}
}
/**
 * Builder指挥者用ConcreteBuilder1构建产品
 * 具体步骤在construct组装好
 * @author xuxhm
 */
public class Test {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
	}
}

```

![模板方法模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/kbuilder.png)

