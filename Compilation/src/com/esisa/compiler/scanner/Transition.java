package com.esisa.compiler.scanner;

import java.util.LinkedList;

public class Transition {
	private LinkedList<Arc>t[];
	public Transition(int stateCount) {
		t= new LinkedList[stateCount];
		for (int i = 0; i < stateCount; i++) {
			t[i]=new LinkedList<Arc>();
			
		}
	}
	
	public void add(Arc a){
		t[a.getSource().getIndex()].add(a);
	}
	public void add(State source,State target,Label label) {
		add(new Arc(source,target,label));
		
	}
	
	public State getNextState(State e ,int s){
		for (Arc a : t[e.getIndex()]) {
			if(a.contains(s)){
				return a.getTarget();
			}
		}
		return null;

	}
}
