package com.corejava.supar;

public class TestClass {
	    private static final String DEFAULT_VALUE = "REQUIRED"; 
	    private String value;

	    public TestClass() {
	    	this(DEFAULT_VALUE);
	    }

	    public TestClass(String value) {
	        // Required here because the private member and parameter have same name
	        this.value = value;
	    }

	    public String getValue() { 
	        // Not required here, but I prefer to add it.  
	        return value;
	    }
	
	public static void main(String[] args) {
		TestClass tt = new TestClass();
		tt.getValue();
	}

}
