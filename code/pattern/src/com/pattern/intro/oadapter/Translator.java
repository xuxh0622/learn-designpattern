package com.pattern.intro.oadapter;
//中间翻译者
public class Translator extends Player{
	
	private ForeignCenter foreignCenter = new ForeignCenter("姚明");

	public Translator(String name) {
		super(name);
	}

	@Override
	public void attach() {
		foreignCenter.foreignAttach();
	}

	@Override
	public void defense() {
		foreignCenter.foreignDefense();
	}
}
