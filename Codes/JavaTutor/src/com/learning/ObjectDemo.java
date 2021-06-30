package com.learning;
import  java.util.ArrayList;

class Calc{
	int num1;
	int num2;
	int result;
	
	public void perform() {
		result = num1 + num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc(); 
		obj.num1=4;
		obj.num2 = 5;
		obj.perform();
		System.out.println(obj.result);
		ArrayList<String> list  = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		System.out.println(list);
	}

}
