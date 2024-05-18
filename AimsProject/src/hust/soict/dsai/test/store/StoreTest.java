package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 9.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Thomas", 90, 18.99f);

		store.removeMedia(dvd2);
	}

}
