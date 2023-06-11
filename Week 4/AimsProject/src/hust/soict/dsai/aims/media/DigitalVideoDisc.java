package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0;
    private String director;
	private int length;
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	/*public void setLength(int length) {
		this.length = length;
	}
	//this class only has instance variables:title, category, director, length, cost.
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id=++nbDigitalVideoDiscs;

	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id=++nbDigitalVideoDiscs;

	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;

	}*/
	
	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(title,category,cost,length,director);

	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	}
	