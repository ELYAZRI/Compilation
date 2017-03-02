package com.esisa.compiler.scanner;

public class Set implements Label{
	private String value;

	public Set(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return "["+ value +"]";
	}

	@Override
	public boolean contains(int s) {
		return (value.indexOf(s) >= 0);
	}
	
}
