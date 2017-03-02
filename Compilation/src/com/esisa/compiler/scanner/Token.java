package com.esisa.compiler.scanner;

public class Token {

	private String value;
	private String LexicalUnit;
	
	public Token() {
			}

		public String toString() {
		return  value + " (" +LexicalUnit+")" ;
	}

	public Token(String value, String lexicalUnit) {
		super();
		this.value = value;
		LexicalUnit = lexicalUnit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLexicalUnit() {
		return LexicalUnit;
	}

	public void setLexicalUnit(String lexicalUnit) {
		LexicalUnit = lexicalUnit;
	}

}
