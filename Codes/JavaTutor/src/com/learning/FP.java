package com.learning;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Product;
import com.example.model.ProductType;



public class FP {
	public static void main(String[] args) {
		List<product> products = new ArrayList<product>();
		products.add(new product(123123, "product-1", 5000, ProductType.ELEC));
		products.add(new product(323122, "product-2", 4000, ProductType.ELEC));
		products.add(new product(423123, "product-3", 3000, ProductType.OTHER));
		products.add(new product(223122, "product-4", 2000, ProductType.ELEC));
		products.add(new product(623122, "product-5", 1000, ProductType.OTHER));
		
		List<product> elecProducts = getElecProducts(products);
		for (product product : elecProducts) {
			System.out.println(product);
		}
	}

	private static List<product> getElecProducts(List<product> products) {
		List<product> out = new ArrayList<product>();
		for (product product : products) {
			if (product.getType().equals(ProductType.ELEC)) {
				out.add(product);
			}
		}
		return out;
	}


}
