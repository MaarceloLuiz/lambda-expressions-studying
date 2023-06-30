package application;

import java.util.Comparator;

import entities.Product;

//we can create a new class to implement this Comparator Interface
public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}
