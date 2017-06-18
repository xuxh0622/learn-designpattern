package com.pattern.intro.riterator;

public class ConcreteIterator extends Iterator{
	
	private ConcreteAggregate aggregate;
	
	int count = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.get(0);
	}

	@Override
	public Object next() {
		count++;
		if(count < aggregate.count()){
			return aggregate.get(count);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		return count >= aggregate.count()?true:false;
	}

	@Override
	public Object currentItem() {
		return aggregate.get(count);
	}

}
