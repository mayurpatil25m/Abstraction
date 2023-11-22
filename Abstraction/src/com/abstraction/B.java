package com.abstraction;

public abstract class B implements A {
	
	public void addition(int num1, int num2) {
		int add = num1 + num2;
		System.out.println("Addition is " + add);
	}
	
	@Override
	public void division(int num1,int num2) {
		float div= num1 / num2;
		System.out.println("Division is "+ div);
	}
	
	public void average(int num1, int num2) {
		int avg = (num1 + num2) / 2;
		System.out.println("Average is " + avg);
	}

}
