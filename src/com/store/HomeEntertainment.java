package com.store;

class HomeEntertainment extends Product implements Returnable, Warranty {
	private int weight;
	private boolean installation;

	public HomeEntertainment(String name, int weight, boolean installation) {
		super(name);
		this.weight = weight;
		this.installation = installation;
	}

	public int getWeight() {
		return weight;
	}

	public boolean getInstallation() {
		return installation;
	}

	public void returnItem() {
		System.out.println("Returned " + this.getName() + " item with weight: " + weight);
	}

	public void printWarranty() {
		System.out.println("Warranty For HomeEntertianment");
	}

	public String toString() {
		return this.getName() + " Home Entertainment with " + weight + " weight.";
	}
}