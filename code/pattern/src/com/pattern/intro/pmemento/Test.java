package com.pattern.intro.pmemento;

public class Test {
	public static void main(String[] args) {
		GameRole test1 = new GameRole();
		test1.display();
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(test1.saveState());
		test1.fight();
		test1.display();
		test1.recoveryState(stateAdmin.getMemento());
		test1.display();
	}
}
