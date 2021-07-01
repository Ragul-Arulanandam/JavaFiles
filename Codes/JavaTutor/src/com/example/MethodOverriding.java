package com.example;

class A{
	public void display() {
		System.out.println("Show....");
		
	}
}
class B extends A{
//	@override
//	public void show() {
//		System.out.println("method overidded....");
//	}
	public void display() {
		super.display();
		System.out.println("Print Both methods");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.display();

	}

}
