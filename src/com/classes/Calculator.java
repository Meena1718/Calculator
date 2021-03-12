package com.classes;

public class Calculator { // class calculator
	public int value1 = 0; // instance variable or attributes
	public int value2 = 0;// instance variable or attributes
	
	/* create a class and then instance variable and then constructor. Constructor has no return value */
	
	public Calculator() { // constructor having same name as class and it has no return value
		this.value1 = value1;
		this.value2 = value2;
	}
     public int add() {
        return value1 + value2;	
    }
     public int add(int value1, int value2) {
 		return value1 + value2;
 	}
 	public double add(double value1, double value2) {
 		return value1 + value2;
 	}
 	public float add(float value1, float value2) {
 		return value1 + value2;
 	}
 	public long add(long value1, long value2) {
 		return value1 + value2;
 	}
     public int sub() {
    	 return value1 - value2;
     }
    public int sub(int value1, int value2) {
	 return value1 - value2;
     }
     public double sub(double value1, double value2) {
	 return value1 - value2;
     }
     public float sub(float value1, float value2) {
	 return value1 - value2;
     }
     public long sub(long value1, long value2) {
	 return value1 - value2;
     }
}
