package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;

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
	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}

}
