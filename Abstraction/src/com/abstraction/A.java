package com.abstraction;

interface  A {
	
	public void addition(int num1 , int num2);
	
	public void subtraction(int num1 , int num2);
	
	static void multiplication(int num1,int num2) {
		int multi = num1 * num2;
		System.out.println("Multiplication is "+ multi);
	}
	
	default void division(int num1,int num2) {
		System.out.println("This is method m4");
	}

}
