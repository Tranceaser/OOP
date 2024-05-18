package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}

	public CompactDisc(int id, String title, String category, float cost, String artist) {
		super(id, title, category, cost);
		this.artist = artist;
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			return;
		} else {
			tracks.add(track);
		}
	}

	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
		}
	}

	public int getLength() {
		int sum = 0;
		for (Track track : tracks) {
			sum += track.getLength();
		}
		return sum;
	}

	@Override
	public void play() {
		for (Track track : tracks) {
			track.play();
		}

	}

	public String toString() {
		return "CD: " + "_" + getId() + "_" + getTitle() + "_" + getCategory() + "_" + getCost() + artist;
	}
}
