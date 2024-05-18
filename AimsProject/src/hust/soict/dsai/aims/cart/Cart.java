package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	// METHOD <count the total cost of all the orders in the cart>
	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered) {
			if (media != null) {
				totalCost += media.getCost();
			}

		}
		return totalCost;
	}

	public void addMedia(Media... medias) {
		for (Media media : medias) {
			itemsOrdered.add(media);
		}
	}

	public void removeMedia(Media media) {
		itemsOrdered.remove(media);
	}

	// METHOD <print cart>
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Order Items:");

		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i) != null) {
				if (itemsOrdered.get(i) instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) itemsOrdered.get(i);
					System.out.print(i + 1);
					System.out.println(". " + " DVD " + " - " + dvd.getTitle() + " - " + dvd.getCategory() + " - "
							+ dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost());
				} else {
					System.out.print(i + 1);
					System.out.println(". " + " DVD " + " - " + itemsOrdered.get(i).getTitle() + " - "
							+ itemsOrdered.get(i).getCategory() + " - " + ": " + itemsOrdered.get(i).getCost());
				}

			}
		}
		System.out.print("Total Cost: ");
		System.out.println(totalCost());
		System.out.println("***************************************************");
	}

	// METHOD <list all the disc order in the cart>
	public void Display(DigitalVideoDisc[] cart) {
		System.out.println("***********************CART***********************");
		System.out.println("Order Items:");

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null) {
				System.out.print(i + 1);
				System.out.println(". " + " DVD " + " - " + cart[i].getTitle() + " - " + cart[i].getCategory() + " - "
						+ cart[i].getDirector() + " - " + cart[i].getLength() + ": " + cart[i].getCost());
			}
		}
		System.out.print("Total Cost: ");
		System.out.println(totalCost());
		System.out.println("***************************************************");
	}

	// METHOD <search order by id>
	public void searchById(int index) {
		DigitalVideoDisc[] resultDisc = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		int i = 0;
		for (Media disc : itemsOrdered) {
			if (disc != null) {
				if (disc.getId() == index) {
					resultDisc[i] = (DigitalVideoDisc) disc;
					i += 1;
				}
			}
		}
		for (DigitalVideoDisc disc : resultDisc) {
			if (disc != null) {
				Display(resultDisc);
				break;
			} else {
				System.out.println("NO MATCH IS FOUND");
			}
		}
	}

	// METHOD <search order by title>
	public void searchByTitle(String tt) {
		DigitalVideoDisc[] resultDisc = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		int i = 0;
		for (Media disc : itemsOrdered) {
			if (disc != null) {
				if (disc.getTitle() == tt) {
					resultDisc[i] = (DigitalVideoDisc) disc;
					i += 1;
				}
			}
		}
		for (DigitalVideoDisc disc : resultDisc) {
			if (disc != null) {
				Display(resultDisc);
				break;
			} else {
				System.out.println("NO MATCH IS FOUND");
			}
		}
	}

	public ArrayList<Media> getItemsOrder() {
		return itemsOrdered;
	}

}