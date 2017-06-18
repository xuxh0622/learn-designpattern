## 备忘录模式（Memento）

**定义**：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。

**实例**：游戏进度存储，比如当前的生命力、攻击力、防御力数据，频繁存储不能存入数据库。

**缺点**：角色状态完整保存到备忘录对象中，如果状态数据很大很多，资源消耗比较大。

![备忘录结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/pmemento.png)

## 模式讲解

**Originator（发起人）**：负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。Originator可根据需要决定Memento存储Originator的哪些内部状态。

**Memento（备忘录）**：负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento。备忘录有两个接口，Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。Originator能够看到一个宽接口，允许它访问返回到先前状态所需的所有数据。

**Caretaker（管理者）**：负责保存好备忘录Memento，不忘对备忘录的内容进行操作和检查。

```java
//发起者
public class Originator {
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//负责创建一个备忘录Memento，用以记录当前时刻它的内部状态
	public Memento createMemento(){
		return new Memento(state);
	}
	//并可使用备忘录恢复内部状态
	public void setMemento(Memento memento){
		this.state = memento.getState();
	}
	public void show(){
		System.out.println(state);
	}
}
/**
 * 备忘录：负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento
 * 把需要保存的细节封装其中，不影响客户端
 * @author xuxhm
 *
 */
public class Memento {
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Memento(String state){
		this.state = state;
	}
}
//管理者
public class Caretaker {
	private Memento memento;
	public Memento getMemento() {
		return memento;
	}
	//负责保存好备忘录Memento，不忘对备忘录的内容进行操作和检查
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
//测试代码
public class Test {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("on");
		o.show();
		//备忘录执行
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		//修改状态
		o.setState("off");
		o.show();
		//恢复刚才状态
		o.setMemento(c.getMemento());
		o.show();
	}
}
```

![备忘录结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/pbasememento.png)