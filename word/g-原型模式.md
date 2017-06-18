## 原型模式

**定义（Prototype）**：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

**实例**：制作Resume（简历），需要打印很多份。

```java
//简历实现Cloneable克隆类，然后实现
public class Resume implements Cloneable{
	private String name;
	private int age;
	private WorkExperience workExperience;
	public Resume(String name,int age){
		this.name = name;
      	this.age = age;
		workExperience = new WorkExperience();
	}
	//为深拷贝做准备
	public Resume(WorkExperience work) throws CloneNotSupportedException{
		this.workExperience = (WorkExperience)work.clone();
	}
	//设置工作经验
	public void setWorkExperience(String workInfo){
		workExperience.setWorkInfo(workInfo);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume obj = new Resume(this.workExperience);
		obj.name = this.name;
		obj.age = this.age;
		return obj;
	}
	public void display(){
		System.out.println(name + age + workExperience.getWorkInfo());
	}
	
}
//工作经历，测试深拷贝
public class WorkExperience implements Cloneable{
	private String workInfo;
	public String getWorkInfo() {
		return workInfo;
	}
	public void setWorkInfo(String workInfo) {
		this.workInfo = workInfo;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
//测试类
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume a = new Resume("test1");
		a.setPersonalInfo(17);
		a.setWorkExperience("第一份");
		
		Resume b = (Resume) a.clone();
		b.setPersonalInfo(20);
		b.setWorkExperience("第二份");
		
		a.display();
		b.display();
	}
}

```

![原型模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/gprototype.png)