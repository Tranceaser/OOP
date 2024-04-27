
public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	private int qtyOrdered = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

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

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i = 0;
		while (itemsOrdered[i] != disc) {
			i++;
		}
		itemsOrdered[i] = null;
		System.out.println("The " + disc.getTitle() + " has been removed");
		qtyOrdered -= 1;
	}

	public float totalCost() {
		float totalCost = 0;
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null) {
				totalCost += disc.getCost();
			}

		}
		return totalCost;
	}

}
