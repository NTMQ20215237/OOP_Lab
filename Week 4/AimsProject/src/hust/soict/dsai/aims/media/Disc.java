package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private String director;
	private int length;
	public Disc(String title,String category, float cost,int length,String director ) {
		super();
		this.length = length;
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}

}
