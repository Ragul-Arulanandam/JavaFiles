package com.example;

class Outer{
	int a;
	public void show () {
		System.out.println("Normal method");
	}
	 class Inner{    //Outer.Inner class
		public void display() {
			System.out.println("Inner Class");
			}
	}
	static class Innerdemo {
		public void display() {
			System.out.println("Static inner Class...");
		}
	}
	
}

public class InnerClass {
	
	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
		
		Outer.Innerdemo obj2 = new Outer.Innerdemo();
		obj2.display();
	}

}
