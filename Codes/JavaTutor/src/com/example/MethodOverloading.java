package com.example;

class Calc{
	int num1;
	int num2;
	String op;
	
	public Calc() {
		num1 = 0;
		num2 = 0;
		op = "Nothing";
	}
	public Calc (int i,int j) {
		num1= i;
		num2 = j; 
		op = "Nothing";
	}
	public Calc(int i,int j,String opi) {
		num1 = i;
		num2= j;
		op = opi;
	}
}
public class MethodOverloading {
	Calc obj = new Calc(3,3);

}
