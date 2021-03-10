package com.classes;

public class Calculator {
	public int firstNumber = 0;
	public int secondNumber = 0;
	
	public Calculator(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
     public int Add() {
        return firstNumber + secondNumber;	
    }
     public int Sub() {
    	 return firstNumber - secondNumber;
     }
}
