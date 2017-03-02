package com.esisa.compiler.scanner;

public class Arc {
	
	private State source;
	private State target;
	private Label label;
	
	public Arc(State source, State target, Label label) {
		super();
		this.source = source;
		this.target = target;
		this.label = label;
	}
	public State getSource() {
		return source;
	}
	
	public void setSource(State source) {
		this.source = source;
	}
	
	public State getTarget() {
		return target;
	}
	
	public void setTarget(State target) {
		this.target = target;
	}
	
	public Label getLabel() {
		return label;
	}
	
	public void setLabel(Label label) {
		this.label = label;
	}
	public boolean contains(int s) {
		return label.contains(s);
	}
	@Override
	public String toString() {
		return source +"--" + label + "->" + target;
	}
	
	
	

}
