## 单例模式

**定义**：保证一个类仅有一个实例，并提供一个访问它的访问点。

**区别**：实用类（静态类）不保存状态，提供一些静态方法或静态属性让你使用，而单例类有状态。实用类不能继承多台，单例类可以。实用类不过是方法属性的集合，单例是有着唯一对象实例。

```java
//单例模式
public class Singleton {
	private static Singleton instance;
	private static final Object syncRoot = new Object();
	private Singleton(){
		
	}
	//未实例化时添加锁
	public static Singleton getInstance(){
		if(instance == null){
			synchronized (syncRoot) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
```

##### spring

> spring采用单例模式，访问高效

```java
protected Object getSingleton(String beanName, boolean allowEarlyReference) {
  		//从缓存中获取对象
        Object singletonObject = this.singletonObjects.get(beanName);
        if (singletonObject == null && isSingletonCurrentlyInCreation(beanName)) {
          	//对缓存加锁
            synchronized (this.singletonObjects) {
                singletonObject = this.earlySingletonObjects.get(beanName);
                //防止加锁当时有进程为对象赋值
                if (singletonObject == null && allowEarlyReference) {
                    ObjectFactory<?> singletonFactory = this.singletonFactories.get(beanName);
                    if (singletonFactory != null) {
                        singletonObject = singletonFactory.getObject();
                        this.earlySingletonObjects.put(beanName, singletonObject);
                        this.singletonFactories.remove(beanName);
                    }
                }
            }
        }
        return (singletonObject != NULL_OBJECT ? singletonObject : null);
    }
```

