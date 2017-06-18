## 观察者模式（Observer）

**定义**：定义了一种一对多的依赖关系，让多个观察者对象同时监听某一主题对象。这个主题对象状态发生改变时，会通知所有观察者对象，使它们能够自动更新自己。

**实例**：Observer观察者观察Subject通知者，如果有变化，触发观察者做出反应。

**使用场景**：当一个对象的改变需要同时改变其他对象的时候，而且不知道具体要改变多少对象。让耦合的双方都依赖抽象，不依赖具体事项，使得各自的变化不会影响另一边的变化。

```java
//通知者抽象类
public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void dettach(Observer observer){
		observers.remove(observer);
	}
	//通知观察者
	public void notifyObserver(){
		for(Observer observer : observers){
			observer.update();
		}
	}
}
//具体观察者
public class ConcreteObserver extends Observer{
	//依赖通知者，需要知道里面状态变化情况
	public ConcreteObserver(Subject subject) {
		super(subject);
	}
	@Override
	public void update() {
		System.out.println(subject.getState() + "观察者更新");
	}
}
//测试方法
public class Test {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver(subject);
		subject.attach(observer);
		subject.notifyObserver();
	}
}
```

**当前实例结构图**

![观察者实例模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/lobserver.png)

**观察者模式结构图**

![观察者基本模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/lbaseobserver.png)

