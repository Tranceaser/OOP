package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {

		// Create a new cart
		Cart anOrder = new Cart();

		// Create new disc objects
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

		// List of disc

		// Adding these cart
//		anOrder.addDigitalVideoDisc(dvd1);
//		anOrder.addDigitalVideoDisc(dvd2);
//		anOrder.addDigitalVideoDisc(dvd3);

		// anOrder.removeDigitalVideoDisc(dvd2);

		anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}
}
