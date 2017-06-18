package com.pattern.intro.ssingleton;
/**
 * 单例模式
 * @author xuxhm
 *
 */
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
