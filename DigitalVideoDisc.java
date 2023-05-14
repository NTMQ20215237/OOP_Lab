package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
	public int getID() {
		return id;
	}
	public String getTitle() {
		return title;
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
	public void setTitle(String title) {
		this.title = title;
	}
	public void setID(int id) {
		this.id = id;
		
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

	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id=++nbDigitalVideoDiscs;
	}
    
	}
	