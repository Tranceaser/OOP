package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}

	public CompactDisc() {
		// TODO Auto-generated constructor stub
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
}
