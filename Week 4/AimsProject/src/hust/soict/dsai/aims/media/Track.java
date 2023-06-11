package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private int length;
    private String title;
	public Track(String title,int length)
	{
		this.title = title;
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	 public boolean equals(Object o){
	        Track e = (Track) o;
	        if (this.title == e.getTitle() && this.length == e.getLength()) return true;
	        return false;
	    }
}
