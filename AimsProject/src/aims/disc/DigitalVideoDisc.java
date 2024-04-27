package aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Getter and setter method
	public int getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
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
