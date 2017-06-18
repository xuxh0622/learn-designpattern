## 组合模式（Composite）

**定义**：将对象组合成树形结构以表示部分-整体的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。

**实例**：公司总部分部OA管理系统，都需要财务部门等。

**使用场景**：需求中体现部分与整体层级的结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式。

**优点**：人力资源部和财务部这些基本对象和分公司、办事处等组合对象的类层级结构，基本对象可以被组合成更复杂的组合对象，而组合对象又可以被组合，不断递归。

```java
//组合中对象声明接口，用于访问和管理Component的子部件
public abstract class Component {
	protected String name;
	public Component(String name){
		this.name = name;
	}
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void display();
}
//存储子部件
public class Composite extends Component{
	private List<Component> children = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}
	@Override
	public void add(Component component){
		children.add(component);
	}
	@Override
	public void remove(Component component){
		children.remove(component);
	}
	@Override
	public void display(){
		for(Component comp : children){
			comp.display();
		}
		System.out.println(name + " display");
	}	
}
//测试代码
public class Test {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		Composite comp = new Composite("Composite X");
		root.add(comp);
		root.display();
	}
}
```

**组合模式实例结构图**

![备忘录结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/qcomposite.png)

**组合模式结构图**

![备忘录结构图](https://github.com/xuxh0622/learn-designpattern/blob/master/image/qbasecomposite.png)

