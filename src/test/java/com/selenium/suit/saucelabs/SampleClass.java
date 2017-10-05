package com.selenium.suit.saucelabs;

public class SampleClass {

	int x = 5, y = 5, z = 0;

	public void sum() {
		z = x + y;
		System.out.println("Sum is " + z);
	}

	public void sum(int a, int b) {
		x = a;
		y = b;
		z = x + y;
		System.out.println("Sum is " + z);
	}

/*	public int sum(int a) {
		x = a;
		z = x + y;
		return z;
	}*/

	public static void main(String args[]) {

		SampleClass obj = new SampleClass();
		obj.sum();
		obj.sum(10, 12);
		//System.out.println(obj.sum());
		obj.sum();
	}
}