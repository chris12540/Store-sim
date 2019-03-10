package com.store;

import java.util.Arrays;

class OfficeSupplies extends Product {
	private int ageLimit;
	private String[] chemicals;

	public OfficeSupplies(String name, int ageLimit, String[] chemicals) {
		super(name);
		this.ageLimit = ageLimit;
		this.chemicals = chemicals;
	}

	public void getAgeLimit() {
		System.out.println(ageLimit);
	}

	public void getChemicals() {
		System.out.println(chemicals);
	}

	public String toString() {
		return this.getName() + " Office Supply with " + ageLimit + " year shelf life and " + Arrays.toString(chemicals)
				+ " chemicals";
	}

}