package hust.soict.dsai.aims.media;

public class Track implements Playable {

	private String title;
	private int length;

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());

	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Track) {
			Track object = (Track) o;
			return this.title == object.getTitle() && this.length == object.getLength();
		}
		return false;

	}

}
