package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			return;
		} else {
			authors.add(authorName);
		}
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}
	}

	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public String toString() {
		return "Book: " + "_" + getId() + "_" + getTitle() + "_" + getCategory() + "_" + getCost();
	}
}
