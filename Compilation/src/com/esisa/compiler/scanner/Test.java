package com.esisa.compiler.scanner;

import com.esisa.compiler.scanner.dfa.Blank;
import com.esisa.compiler.scanner.dfa.Identifier;
import com.esisa.compiler.scanner.dfa.LitteralString;
import com.esisa.compiler.scanner.dfa.Number;

public class Test {

	public Test() {
		exp06();
	}
	
	void exp01(){
		
		State e0= new State(0);
		State e1= new State(0,true);
	
		System.out.println(e0);
		System.out.println(e1);
	}
	void exp02(){
		
		State e0= new State(0);
		State e1= new State(1,true);
		
		Arc a1=new Arc(e0, e1, new Interval('a', 'z'));
		System.out.println(a1);
	}
	void exp03(){
		DFA a =new DFA("nb", 4);
		a.setAccepting(1, true);
		a.setAccepting(2, true);
		a.setTransition(0, 1,'0','9');
		a.setTransition(0, 3,'.');
		a.setTransition(1, 1,'0','9');
		a.setTransition(1, 2,'.');
		a.setTransition(2, 2,'0','9');
		a.setTransition(3, 2,'0','9');
		
		String inputTape="x = 25.14 * (y + 547);";
		System.out.println(a.extract(inputTape, 0));
		System.out.println(a.extract(inputTape, 4));
		System.out.println(a.extract(inputTape, 17));
	}
	
	void exp04(){
		DFA a =new Number();
		String inputTape="x = 25.14 * (y + 547);";
		System.out.println(a.extract(inputTape, 0));
		System.out.println(a.extract(inputTape, 4));
		System.out.println(a.extract(inputTape, 17));
		
	}
	void exp05(){
		DFA a1 =new Number();
		DFA a2 =new Identifier();
		String inputTape="x = 25.14 * (alpha + 547);";
		System.out.println(a1.extract(inputTape, 0));
		System.out.println(a2.extract(inputTape, 0));
		System.out.println(a2.extract(inputTape, 13));
		System.out.println(a1.extract(inputTape, 4));
		System.out.println(a1.extract(inputTape, 21));
		
	}
	void exp06(){
		InputeTape it ;
		it = new InputeTape(new StringInputSource("x = 25.14 * (alpha + 547);"));
		
	}
	
	public static void main(String[] args) {
		new Test();

	}

}
