
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	public String getTitle() {
		return title;
	}

// Getter and setter  method
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

// Constructor
	public DigitalVideoDisc(String title) {
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

}
