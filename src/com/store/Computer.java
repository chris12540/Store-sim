package com.store;

public class Computer extends Product implements Returnable, Warranty {
	private String processor;

	public Computer(String name, String processor) {
		super(name);
		this.processor = processor;
	}

	public String getProcessor() {
		return processor;
	}

	public void returnItem() {
		System.out.println("Returned computer with processor: " + processor);
	}

	public void printWarranty() {
		System.out.println("Warranty For Computer");
	}

	public String toString() {
		return this.getName() + " Computer with " + processor + " processor.";
	}
}