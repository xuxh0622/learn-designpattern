package com.pattern.intro.qcomposite.base;

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
