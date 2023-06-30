package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//instead of creating a whole anonymous class, we can make our declaration smaller by using a lambda expression:
		
		//arrow function:
		//this 'comp' is a function receiving as an argument 'p1, p2' and returning the comparison
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
				

		list.sort(comp);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}