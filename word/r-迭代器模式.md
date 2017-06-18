## 迭代器模式（Iterator）

**定义**：提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。

**实例**：乘车购票，每个人过滤一遍。

```java
//定义迭代对象
public abstract class Iterator {
	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentItem();
}
//聚合实现类
public class ConcreteAggregate extends Aggregate{
	private List<Object> items = new ArrayList<Object>();
	public int count(){
		return items.size();
	}
	public Object get(int index){
		return items.get(index);
	}
	public void add(Object object){
		items.add(object);
	}
}
//测试类
public class Test {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.add("大鸟");
		a.add("小菜");
		a.add("行李");
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem());
			i.next();
		}
	}
}
```

![备忘录结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/rbaseiterator.png)