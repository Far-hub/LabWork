package com.java.basics;

public class Methods {

	public static void main(String[] args) {
		Methods name = new Methods();
		name.Farjana();
		Akond();
		
	}
		//Scenario 1: Create an instance method and a static method in a class and call them from the main method.
		public void Farjana() {
			System.out.println("Farjana");
		}
		public static void Akond() {
			System.out.println("Akond");
		}
		
		//Scenario 2. Create a static method and call it from an instance method .
		public static void call() {
			System.out.println("called");
		}
		public void calling() {
			call();
		}
		//Scenario 3. Create an instance method and call it from a static  method .
		public void incall() {
			System.out.println("java calling");
		}
		public static void incalling() {
			Methods name = new Methods();
			name.incall();
		}
		
		//Scenario 4. Create three instance methods and call the second and third method  from the first method .
		
		public void insmethod1() {
			Methods name = new Methods();
			name.insmethod2();
			name.insmethod3();
		}
		public void insmethod2() {
			System.out.println("Farjana Akond");
		}
		public void insmethod3() {
			System.out.println("Juthi");
		}
		
		
		
		
		
		
		
		
		
		


	

}
