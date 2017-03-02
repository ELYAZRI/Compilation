package com.esisa.compiler.scanner;

public class StringInputSource implements InputeSource{
    private String buffer;
    
	public StringInputSource(String buffer) {
		super();
		this.buffer = buffer;
	}

	public String getBuffer() {
		return buffer;
	}

}
