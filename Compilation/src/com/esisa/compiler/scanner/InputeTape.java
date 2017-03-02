package com.esisa.compiler.scanner;



public class InputeTape  {
	private String buffer = "";
	private int readhead = 0 ;
	private int start = 0 ;

	public InputeTape() {
		
	}
    public InputeTape(InputeSource source) {
		buffer = source.getBuffer();
	}
	
	public String getBuffer() {
		
		return null;
	}

}
