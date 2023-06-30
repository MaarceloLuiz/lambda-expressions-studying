package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//using the Comparable method to sort the list the way we choose
		
		//however, It may not be efficient because if we need to change our comparison method, we would have to make a few changes in our class "Product"
		//We don't want that, our comparison methods must not depend of the class "Product"
		Collections.sort(list);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}