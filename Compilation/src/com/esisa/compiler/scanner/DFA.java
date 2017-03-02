package com.esisa.compiler.scanner;

public class DFA {
	private String name;
	private State e[];
	private Transition t;
	
	public DFA(String name, int stateCount) {
		this.name=name;
		t=new Transition(stateCount);
		e=new State[stateCount];
		
		for (int i = 0; i < stateCount; i++) {
			e[i]=new State(i);
		}
	}
	
	public void setAccepting(int index,boolean accpeting){
		e[index].setAccepting(accpeting);
	}
	
	public void setTransition(int source,int target,Label label){
		t.add(e[source], e[target], label);
	}
	public void setTransition(int source,int target,char s){
		t.add(e[source], e[target], new Symbol(s));
	}
	public void setTransition(int source,int target,char min,char max){
		t.add(e[source], e[target], new Interval(min, max));
	}
	public void setTransition(int source,int target,String set){
		t.add(e[source], e[target], new Set(set));
	}
	
	public Token extract(String inputTape,int readHead){
		State e=this.e[0];
		char s=inputTape.charAt(readHead);
		int start=readHead;
		State suivant =t.getNextState(e, s);
		while (suivant!=null) {
			e=suivant;
			readHead++;
			s=inputTape.charAt(readHead);
			suivant=t.getNextState(e, s);
		}
		if (e.isAccepting()) {
			String value=inputTape.substring(start,readHead);
			Token token=new Token(value,name);
			return token;
		} 
		else {
			readHead=start;
			return null;
		}
	}
}
