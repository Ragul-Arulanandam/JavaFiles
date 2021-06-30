package com.example;

class Calculator{   //Parent Class or a Base class
	public int add(int i, int j) {
		return i+j;
	}
}
class Calcadv extends Calculator{   //Child class add method is inherited here
	public int sub(int i, int j) {
		return i-j;
	}
}

class Calcchild extends Calcadv{            //Child Class both sub and add method is inherited from the above class
	public int mul(int i ,int j) {     
		return i*j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
//		Calculator obj = new Calculator();
		
		Calcchild obj = new Calcchild();
		
		System.out.println(obj.add(4, 5));
		System.out.println(obj.sub(4, 5));
		System.out.println(obj.mul(4, 5));
	}

}
