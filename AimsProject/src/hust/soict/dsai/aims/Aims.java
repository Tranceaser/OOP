package hust.soict.dsai.aims;

import java.util.Collections;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Aims {

	public static void main(String[] args) {

		// Create a new cart
		Cart anOrder = new Cart();

		// Create new disc objects
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 9.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Thomas", 90, 18.99f);

		DigitalVideoDisc dvd4 = new DigitalVideoDisc(2, "Star Wars", "Science", "George Demos", 87, 20.95f);

		// List of disc

		// Adding these cart
//		anOrder.addDigitalVideoDisc(dvd1);
//		anOrder.addDigitalVideoDisc(dvd2);
//		anOrder.addDigitalVideoDisc(dvd3);

		// anOrder.removeDigitalVideoDisc(dvd2);

//		anOrder.addMedia(dvd1, dvd2, dvd3);
//
//		System.out.print("Total cost is: ");
//		System.out.println(anOrder.totalCost());
		////////////////////////////////////////////////////////////////////
//
//		Book book = new Book(1, "The Lion King", "Animation", 9.95f);
//		CompactDisc cD = new CompactDisc(2, "Star Wars", "Science Fiction", 25.0f, "Thomas");
//		DigitalVideoDisc dVD = new DigitalVideoDisc(3, "Aladin", "Animation", "Thomas", 90, 18.99f);
//
//		List<Media> mediae = new ArrayList<Media>();
//		mediae.add(book);
//		mediae.add(cD);
//		mediae.add(dVD);
//		for (Media media : mediae) {
//			System.out.println(media.toString());
//		}
//////////////////////////////////////////////////////////////////////////////////////
		anOrder.addMedia(dvd1, dvd2, dvd3, dvd4);
		System.out.println(anOrder.getItemsOrder());
		Collections.sort(anOrder.getItemsOrder(), Media.COMPARE_BY_TITLE_COST);
		System.out.println(anOrder.getItemsOrder());

	}
}
