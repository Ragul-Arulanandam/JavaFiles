package com.learning;
import java.util.ArrayList;
public class Ex1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Veg");
		list.add("Nonveg");
		list.add("Veg");
		list.add("Nonveg");
		list.add("Veg");
		list.add("Nonveg");
		System.out.println(list);
		
		for(int i=0;i<=list.size();i++) {
			if(list.get(i).equals("Veg")) {
				list.set(i,"*");
			}
			
		}
		public class example {
		    
		    public static void main(String[] args) {
		        
		        List<String> menu = new ArrayList<String>();
		        
		        
		        menu.add("veg");
		        menu.add("veg");
		        menu.add("Nonveg");
		        menu.add("veg");
		        menu.add("Nonveg");
		        menu.add("veg");
		        
		        for(int i = 0 ; i<menu.size();i++ ) {
		            
		            if(menu.get(i).equals("Nonveg") ){
		                
		                menu.set(i, "*");
		                
		                
		            }
		            
		            
		        }
		        
		        for(String s : list) {
		            
		            System.out.println(s);
		                
		        
		        }
		        
		    }}
		 
		
		
			
	}
	
}
