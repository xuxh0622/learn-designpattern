package com.pattern.intro.kbuilder;

import java.util.ArrayList;
import java.util.List;
//产品类，由多个部件组成
public class Product {
	List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		for(String part: parts){
			System.out.println(part);
		}
	}
}
