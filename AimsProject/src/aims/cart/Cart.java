package aims.cart;

import aims.disc.DigitalVideoDisc;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	private int qtyOrdered = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	// METHOD <to add the disc order into the cart>
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int i = 0;
		while (itemsOrdered[i] != null) {
			i++;
		}
		if (i == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			itemsOrdered[i] = disc;
			System.out.println("The " + disc.getTitle() + " has been added");
			qtyOrdered += 1;
		}

	}

	// METHOD
	// new addDigitalVideoDisc method -- overloading -- different type of parameters
//	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//		int p = 0;
//		int i = 0;
//		while (i < itemsOrdered.length) {
//			while (p < dvdList.length) {
//				if (itemsOrdered[i] == null) {
//					itemsOrdered[i] = dvdList[p];
//					System.out.println("The " + dvdList[p].getTitle() + " has been added");
//					qtyOrdered += 1;
//					p = p + 1;
//					i = i + 1;
//				}
//			}
//			break;
//		}
//	}

	// METHOD
	// new addDigitalVideoDisc method -- overloading -- Passing arbitrary number of
	// arguments
	public void addDigitalVideoDisc(DigitalVideoDisc... dvd) {
		int p = 0;
		int i = 0;
		while (i < itemsOrdered.length) {
			while (p < dvd.length) {
				if (itemsOrdered[i] == null) {
					itemsOrdered[i] = dvd[p];
					System.out.println("The " + dvd[p].getTitle() + " has been added");
					qtyOrdered += 1;
					p = p + 1;
					i = i + 1;
				}
			}
			break;
		}
	}

	// METHOD
	// new addDigitalVideoDisc method -- overloading -- different number of
	// parameters
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int i = 0;
		while (itemsOrdered[i] != null) {
			i += 1;
		}
		itemsOrdered[i] = dvd1;
		System.out.println("The " + dvd1.getTitle() + " has been added");
		qtyOrdered += 1;

		i = 0;
		while (itemsOrdered[i] != null) {
			i += 1;
		}
		itemsOrdered[i] = dvd2;
		System.out.println("The " + dvd2.getTitle() + " has been added");
		qtyOrdered += 1;
	}

	// METHOD <remove some disc in the order>
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i = 0;
		while (itemsOrdered[i] != disc) {
			i++;
		}
		itemsOrdered[i] = null;
		System.out.println("The " + disc.getTitle() + " has been removed");
		qtyOrdered -= 1;
	}

	// METHOD <count the total cost of all the orders in the cart>
	public float totalCost() {
		float totalCost = 0;
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null) {
				totalCost += disc.getCost();
			}

		}
		return totalCost;
	}

	// METHOD <print cart>
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Order Items:");

		for (int i = 0; i < itemsOrdered.length; i++) {
			if (itemsOrdered[i] != null) {
				System.out.print(i + 1);
				System.out.println(". " + " DVD " + " - " + itemsOrdered[i].getTitle() + " - "
						+ itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - "
						+ itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost());
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
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null) {
				if (disc.getId() == index) {
					resultDisc[i] = disc;
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
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null) {
				if (disc.getTitle() == tt) {
					resultDisc[i] = disc;
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

}