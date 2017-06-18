## 代理模式

**定义**：为其他对象提供一种代理以控制这个对象的访问。

**实例**：Pursuit（追求者）通过Proxy（代理）给SchoolGirl（被追求者）送礼物。

```java
/**
 * 代理
 * @author xuxhm
 *
 */
public class Proxy implements GiveGift{
	//被代理类
	private Pursuit pursuit;
	public Proxy(SchoolGirl schoolGirl){
		this.pursuit = new Pursuit(schoolGirl);
	}
	@Override
	public void GiveDolls() {
		pursuit.GiveDolls();
	}
	@Override
	public void GiveFlowers() {
		pursuit.GiveFlowers();
	}
}
package com.pattern.intro.eproxy;
/**
 * 追求者Pursuit追求SchoolGirl，通过Proxy办理，实际调用追求者方法
 * @author xuxhm
 *
 */
public class Test {
	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl("test");
		Proxy proxy = new Proxy(schoolGirl);
		proxy.GiveDolls();
		proxy.GiveFlowers();
	}
}
```

![代理模式](https://github.com/xuxh0622/learn-designpattern/blob/master/image/dproxy.png)