package com.abstraction;

public class C extends B {
	public void subtraction(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Subtraction is " + sub);
	}
	
	public void table(int num) {
		for(int i=1;i<=10;i++) {
			System.out.print(num * i +" " );
		}
		
	}

	

	
}
