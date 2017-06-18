## 享元模式（flyweight）

**定义**：运用共享技术有效地支持大量细粒度的对象。

**实例**：各个网站相似度高，那么对硬盘、内存、CPU、数据库空间等服务器资源都可以达成共享，减少服务器资源，而对于代码，由于一份实例，更好维护。

**使用场景**：如果一个应用程序使用了大量的对象，而大量的这些对象造成了很大的存储开销就应该考虑使用；还有就是对象的大多数状态可以外部状态，如果删除对象的外部状态，那么可以用相对较少的共享对象去掉很多组对象，此时可以考虑用享元模式。

```java
//享元工厂，用来创建并管理Flyweight对象
public class FlyweidhtFactory {
	private Hashtable<String,Flyweight> flyweights = new Hashtable<String,Flyweight>();	
	public FlyweidhtFactory(){
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key){
		return flyweights.get(key);
	}
}
//具体享元类的超类，通过这个接口，Flyweight可以接受并作用于外部状态
public interface Flyweight {
	void operation(int extrinsicstate);
}
//测试
public class Test {
	public static void main(String[] args) {
		FlyweidhtFactory f = new FlyweidhtFactory();
		Flyweight fx = f.getFlyweight("X");
		fx.operation(10);
		UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(20);
	}
}
```

![结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/xflyweight.png)

![结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/xbaseflyweight.png)