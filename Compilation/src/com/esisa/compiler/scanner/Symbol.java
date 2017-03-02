package com.esisa.compiler.scanner;

public class Symbol implements Label{
	private char value;

	public Symbol(int value) {
		super();
		this.value =(char)value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = (char)value;
	}
	
	public String toString() {
		return "'"+ value + "'";
	}

	@Override
	public boolean contains(int s) {
		return s==value;
	}
	
}
