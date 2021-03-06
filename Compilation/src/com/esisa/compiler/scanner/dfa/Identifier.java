package com.esisa.compiler.scanner.dfa;

import com.esisa.compiler.scanner.DFA;

public class Identifier extends DFA{

	public Identifier() {
		this("id");
	}
	

	public Identifier(String name) {
	super(name,2);
	setAccepting(1, true);
	setTransition(0, 1, 'a','z');
	setTransition(0, 1, 'A','Z');
	setTransition(0, 1, '_');
	setTransition(1, 1, 'a','z');
	setTransition(1, 1, 'A','Z');
	setTransition(1, 1, '_');
	setTransition(1, 1, '0','9');
	}
	

}
