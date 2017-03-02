package com.esisa.compiler.scanner;

public class State {
	
	private int index;
	private boolean accepting;
	
	public State(int index) {
		this.index = index;
		accepting=false;
	}
	
	public State(int index, boolean accepting) {
		this.index = index;
		this.accepting = accepting;
	}

	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public boolean isAccepting() {
		return accepting;
	}
	
	public void setAccepting(boolean accepting) {
		this.accepting = accepting;
	}

	@Override
	public String toString() {
		if(!accepting) return "("+index+") ";
		else return " ((" + index + ")) ";
	}
	
}
