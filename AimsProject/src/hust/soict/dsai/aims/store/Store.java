package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {

	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsInStore.contains(media) == false) {
			itemsInStore.add(media);
			System.out.println("The " + media.getTitle() + " has been added to store");
		}

	}

	public void removeMedia(Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("The " + media.getTitle() + " has been removed from store");
		}
	}

	public void Display() {
		System.out.println("***********************CART***********************");
		System.out.println("Order Items:");

		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i) != null) {
				if (itemsInStore.get(i) instanceof DigitalVideoDisc) {

					DigitalVideoDisc dvd = (DigitalVideoDisc) itemsInStore.get(i);
					System.out.print(i + 1);
					System.out.println(". " + " DVD " + " - " + dvd.getTitle() + " - " + dvd.getCategory() + " - "
							+ dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost());

				} else if (itemsInStore.get(i) instanceof Book) {
					Book book = (Book) itemsInStore.get(i);
					System.out.print(i + 1);
					System.out.println(". " + " Book " + " - " + book.getTitle() + " - " + book.getCategory() + " - "
							+ ": " + book.getCost());

				} else if (itemsInStore.get(i) instanceof CompactDisc) {
					CompactDisc cD = (CompactDisc) itemsInStore.get(i);
					System.out.print(i + 1);
					System.out.println(". " + " Book " + " - " + cD.getTitle() + " - " + cD.getCategory() + " - "
							+ cD.getDirector() + " - " + cD.getLength() + " - " + cD.getArtist() + ": " + cD.getCost());

				}
			}
		}
		System.out.println("***************************************************");
	}

	public List<Media> searchByTitle(String tt) {
		List<Media> resultMedia = new ArrayList<Media>();
		for (Media media : itemsInStore) {
			if (media.getTitle() == tt) {
				resultMedia.add((Media) media);
			}
		}
		return resultMedia;

	}

}
