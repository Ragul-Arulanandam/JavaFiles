package com.example;

class sum1{
	public int sum(int ... n){ //variable length arguments
		int sum = 0;
		for(int i : n) {
			sum = sum +i;
		}
		return sum;
		
	}
}
public class VaragsDemo {
	
	public static void main(String [] args) {
		sum1 obj = new sum1();
		System.out.println(obj.sum(1,2,3,3,4,5,9));
	}

}
