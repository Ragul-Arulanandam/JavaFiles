package com.learning;
import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Veg");
		list.add("NonVeg");
		list.add("Veg");
		list.add("NonVeg");
		list.add("Veg");
		list.add("NonVeg");
		list.add("Veg");
		list.add("NonVeg");
		
//		Collections.replaceAll(list,"NonVeg","*");
//		list.replaceAll(item->item.equlals("NonVeg")?"*":items);
		list.replaceAll(menuItem -> menuItem.equals("NonVeg") ? "*" : menuItem);
//		Collections.sort(list);
//		list.removeIf(item->item.equals("NonVeg"));
		System.out.println(list);
		

	}

}
