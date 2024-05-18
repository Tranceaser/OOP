package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// Constructor
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;

	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());

	}

	public String toString() {
		return "DVD: " + "_" + getId() + "_" + getTitle() + "_" + getCategory() + "_" + director + "_" + "_" + length
				+ "_" + getCost();
	}

}
