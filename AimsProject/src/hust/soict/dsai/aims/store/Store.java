package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {

	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000];

	public void addDVD(DigitalVideoDisc disc) {
		int i = 0;
		while (itemsInStore[i] != null) {
			i++;
		}
		itemsInStore[i] = disc;
		System.out.println("The " + disc.getTitle() + " has been added to store");
	}

	public void removeDVD(DigitalVideoDisc disc) {
		int i = 0;
		while (itemsInStore[i] != disc) {
			i++;
		}
		itemsInStore[i] = null;
		System.out.println("The " + disc.getTitle() + " has been removed from store");
	}

}
