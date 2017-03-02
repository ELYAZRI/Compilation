package com.esisa.compiler.scanner;

public class Interval implements Label{
	private char min;
	private char max;
	
	public Interval(int min, int max) {
		super();
		this.min = (char)min;
		this.max = (char)max;
	}

	public char getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = (char)min;
	}

	public char getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = (char)max;
	}
	
	@Override
	public String toString() {
		
		return "'" + min + "'..'" + max +"'";
	}

	@Override
	public boolean contains(int s) {
		return (s>=min && s<=max);
	}
	


}
