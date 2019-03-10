package com.store;

// import java.util.Arrays;
import java.util.Random;

/**
 * Store
 */
public class Store {
	public static void main(String[] args) {
		Product[] gifts = new Product[] { new Computer("Fast Computer", "I7 9770k"), new Computer("Ok computer", "I5 5500"),
				new Computer("Slow computer", "Intel Atom"), new HomeEntertainment("Speaker", 30, false),
				new HomeEntertainment("TV", 50, true), new HomeEntertainment("Projector Screen", 100, true),
				new OfficeSupplies("Pens", 50, new String[] { "ink" }),
				new OfficeSupplies("Air Blaster", 10, new String[] { "compressed air", "freon" }),
				new OfficeSupplies("Dry Erase Markers", 5, new String[] { "alcohol", "ink" }),
				new OfficeSupplies("Glue", 3, new String[] { "corn syrup", "mussel", "gum arabic", "isinglass" }) };

		Random rand = new Random();

		for (int i = 1; i <= 100; i++) {
			Product gift = gifts[rand.nextInt(10)];
			int count = 0;
			while (gift instanceof Computer || gift instanceof HomeEntertainment) {
				if (count == 3) {
					System.out.println("Customer " + i + " You are no longer eligible for this offer as you are abusing it!");
					break;
				}
				gift.returnItem();
				gift = gifts[rand.nextInt(10)];
				count++;
			}
			if (count >= 3) {
				continue;
			}
			System.out.println("Customer " + i + " recieves: " + gift);
		}
		// System.out.println(Arrays.toString(gifts));
	}
}
