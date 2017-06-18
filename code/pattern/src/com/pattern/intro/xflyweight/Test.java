package com.pattern.intro.xflyweight;

public class Test {
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		WebSite fx = f.getWebSiteCategory("test1");
		WebSite fy = f.getWebSiteCategory("test1");
		WebSite fz = f.getWebSiteCategory("test2");
		WebSite fm = f.getWebSiteCategory("test2");
		System.out.println(f.getWebSiteCount());

	}
}
