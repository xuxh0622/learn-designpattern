package com.pattern.intro.bstrategy;
/**
 * 策略模式和简单工厂模式结合
 * @author xuxhm
 *
 */
public class Context {
	//聚合策略对象
	private Strategy strategy;
	
	public Context(char type){
		switch(type){
			case 'A':
				strategy = new ConcreteStrategyA();
				break;
			case 'B':
				strategy = new ConcreteStrategyB();
				break;
		}
	}
	
	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
}
