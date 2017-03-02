package com.esisa.compiler.scanner.dfa;

import com.esisa.compiler.scanner.DFA;

public class Number extends DFA{

	public Number() {
		this("nb");
	}
	public Number(String name){
		super(name, 4);
		super.setAccepting(1, true);
		super.setAccepting(2, true);
		super.setTransition(0, 1,'0','9');
		super.setTransition(0, 3,'.');
		super.setTransition(1, 1,'0','9');
		super.setTransition(1, 2,'.');
		super.setTransition(2, 2,'0','9');
		super.setTransition(3, 2,'0','9');
		
	}

}
