package com.store;

/**
 * Product
 */
public class Product implements Returnable {
	private String name;

	public Product(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void returnItem() {
		System.out.println("Returned " + name);
	}
}