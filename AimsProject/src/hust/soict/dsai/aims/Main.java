package hust.soict.dsai.aims;

import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class Main {
	private static Store store = new Store();
	private static Cart cart = new Cart();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isRunning = true;
		while (isRunning) {
			showMenu();
			int option = scanner.nextInt();
			switch (option) {
			case 0:
				isRunning = false;
				break;
			case 1:
				viewStore();
				break;
			case 2:
				updateStore();
				break;
			case 3:
				seeCurrentCart();
				break;
			default:
				System.out.println("Invalid option. Please choose again.");
			}
		}
	}

	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void viewStore() {
		store.Display();
		boolean inStoreMenu = true;
		while (inStoreMenu) {
			storeMenu();
			int option = scanner.nextInt();
			switch (option) {
			case 0:
				inStoreMenu = false;
				break;
			case 1:
				seeMediaDetails();
				break;
			case 2:
				addMediaToCart();
				break;
			case 3:
				playMedia();
				break;
			case 4:
				seeCurrentCart();
				break;
			default:
				System.out.println("Invalid option. Please choose again.");
			}
		}
	}

	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void seeMediaDetails() {
		System.out.println("Enter the title of the media: ");
		scanner.nextLine();
		String title = scanner.nextLine();
		store.searchByTitle(title);
		mediaDetailsMenu();
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			addMediaToCart(title);
			break;
		case 2:
			playMedia(title);
			break;
		case 0:
			break;
		default:
			System.out.println("Invalid option. Please choose again.");
		}
	}

	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void addMediaToCart() {
		System.out.println("Enter the title of the media: ");
		scanner.nextLine();
		String title = scanner.nextLine();
		for (Media m : store.searchByTitle(title)) {
			cart.addMedia(m);
		}
	}

	public static void addMediaToCart(String title) {
		for (Media m : store.searchByTitle(title)) {
			cart.addMedia(m);
		}
	}

	public static void playMedia() {
		System.out.println("Enter the title of the media: ");
		scanner.nextLine();
		String title = scanner.nextLine();
		cart.searchByTitle(title);
	}

	public static void playMedia(String title) {
		cart.searchByTitle(title);
	}

	public static void updateStore() {
	}

	public static void seeCurrentCart() {
		cart.print();
		boolean inCartMenu = true;
		while (inCartMenu) {
			cartMenu();
			int option = scanner.nextInt();
			switch (option) {
			case 0:
				inCartMenu = false;
				break;
			case 1:
				System.out.println("What title you want to find?");
				String title = scanner.nextLine();
				filterMediasInCart(title);
				break;
			case 2:
				sortMediasInCart();
				break;
			case 3:
				removeMediaFromCart();
				break;
			case 4:
				playMediaFromCart();
				break;
			case 5:
				placeOrder();
				break;
			default:
				System.out.println("Invalid option. Please choose again.");
			}
		}
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void filterMediasInCart(String title) {
		cart.searchByTitle(title);

	}

	public static void sortMediasInCart() {
		Collections.sort(cart.getItemsOrder(), Media.COMPARE_BY_TITLE_COST);
	}

	public static void removeMediaFromCart() {
		String title = scanner.nextLine();
		int i = 0;
		for (int j = 0; j < cart.getItemsOrder().size(); j++) {
			if (cart.getItemsOrder().get(j).getTitle() == title) {
				i = j;
				break;
			}
		}
		Media m = cart.getItemsOrder().get(i);
		cart.removeMedia(m);

	}

	public static void playMediaFromCart() {
		for (Media m : cart.getItemsOrder()) {
			if (m instanceof CompactDisc) {
				CompactDisc cD = (CompactDisc) m;
				cD.play();
			} else if (m instanceof DigitalVideoDisc) {
				DigitalVideoDisc dVD = (DigitalVideoDisc) m;
				dVD.play();
			}

		}

	}

	public static void placeOrder() {
		System.out.println("An order is created.");
		cart = new Cart(); // Empty the current cart
	}
}
