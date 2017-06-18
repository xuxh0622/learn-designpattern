package com.pattern.intro.ssingleton;

public class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2){
			System.out.print("same");
		}
	}
}
