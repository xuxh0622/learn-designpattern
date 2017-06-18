## 抽象工厂模式（Abstract Factory）

**定义**：提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体的类。

**实例**：数据库从oracle转变成mysql。

**优点**：便于交换产品系列。

**缺点**：工厂类太多，客户端需要修改很多地方，最好用反射模式替换抽象工厂的定义，然后xml配置不同参数映射不同的实现类。

```java
public class DataAccess {
	//解析获取数据库连接
	private static String DB;
	
	static{
		DB = "Oracle"
	}
	//获取对象
	public static IDepartment createDepartment(){
		IDepartment obj = null;
		try {
			Class c = Class.forName("com.pattern.intro.mfactory." + DB + "Department");
			obj = (IDepartment)c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
//测试
public class Test {
	public static void main(String[] args) {
		IDepartment department = DataAccess.createDepartment();
		department.insert(null);
	}
}
```

**当前实例结构图**

![抽象工厂举例模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/mfactory.png)

**抽象工厂模式结构图**

![抽象工厂基本模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/mbasefactory.png)