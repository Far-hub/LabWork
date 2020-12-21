package com.java.basics;

public class Variables {
	
	int p = 5;
	double q = 6;
	
	static int a;
	static long b;

	public static void main(String[] args) {
		// Scenario 1: Create two local  variables with different primitive data types and sum their value.
		int i = 10;
		double d = 20.5;
		double sum = i+d;
		System.out.println(sum);
		
		
		//Scenario 2: Create two local  variables with String  data types and concatenate.
		
		String s1 = "Farjana";
		String s2 ="Enjoy Coding";
		
		System.out.println(s1+" "+s2);
		
		//Scenario 3: Create two instance variables with different data types and use  their value in  static and instance method
		Variables var = new Variables();
		System.out.println(var.p+var.q);
		
		//Scenario 4: Create two static variables with different data types and use their value in a static method and in an instance method.

		a = 50;
		b =60;
		long c = a+b;
		System.out.println(c);
		var.instance();
	
	}
	public void instance() {

		
		//Scenario 3: Create two instance variables with different data types and use  their value in  static and instance method
		
		Variables var = new Variables();
		System.out.println(var.p+var.q);
		
		//Scenario 4: Create two static variables with different data types and use their value in a static method and in an instance method.
		a =40;
		b =30;
		Object o = a+b;
		System.out.println(o);
		
		
		
	}
	

}
