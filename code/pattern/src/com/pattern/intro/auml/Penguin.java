package com.pattern.intro.auml;
/**
 * 继承类(实线-空心三角形Animal)
 * 实现接口(虚线-空心三角形IFly)
 * 关联关系(实线-箭头Climate)
 * 组合关系(脚箭头-实线-实心菱形企鹅)
 * 依赖关系(虚线-箭头空气)
 * @author xuxhm 企鹅类
 *
 */
public class Penguin extends Animal implements IFly{
	
	//关联关系(实线-箭头Climate气候)
	private Climate climate;
	
	private Foot foot;
	//组合Foot
	public Penguin(Foot foot){
		this.foot = foot;
	}

	@Override
	public void fly() {

	}
	
	//依赖空气(虚线-箭头空气)
	public void Metabolism(Oxygen oxygen){
		
	}

}
