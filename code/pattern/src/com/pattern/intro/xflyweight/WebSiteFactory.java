package com.pattern.intro.xflyweight;

import java.util.Hashtable;

public class WebSiteFactory {
	private Hashtable<String,WebSite> flyweights = new Hashtable<String,WebSite>();
	public WebSite getWebSiteCategory(String name){
		if(!flyweights.contains(name)){
			flyweights.put(name, new ConcreteWebSite(name));
		}
		return flyweights.get(name);
	}
	
	public int getWebSiteCount(){
		return flyweights.size();
	}
}
