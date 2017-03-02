package com.esisa.compiler.scanner.dfa;

import com.esisa.compiler.scanner.DFA;

public class LitteralString extends DFA{

	public LitteralString() {
		this("LitStr");
	}
	public LitteralString(String name) {
		super(name,2);
		setAccepting(1, true);
		setTransition(0, 1, '*');
		setTransition(1, 1, '*');
		}
		
}
