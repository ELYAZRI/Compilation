package com.esisa.compiler.scanner.dfa;

import com.esisa.compiler.scanner.DFA;

public class Blank extends DFA{

	public Blank(){
		this("Blank");
	}
public Blank(String name){
	 super(name,2);
	 setAccepting(1, true);
	 setTransition(0, 1, " \t\r\n");
	 setTransition(1, 1, " \t\r\n");
    }
}
