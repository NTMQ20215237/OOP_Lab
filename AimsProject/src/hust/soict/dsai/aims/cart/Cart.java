package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.*;
import java.util.*;
public class Cart {private int qtyOrdered = 0;
private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

public int getQtyOrdered() {
	return this.qtyOrdered;
}
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n***********************CART***********************\nOrdered Items:");
    for (int i = 0; i < this.itemsOrdered.size(); i++) {
        sb.append("\n" + (i + 1) + ".Media - " + itemsOrdered.get(i).getTitle() + " - "
                + itemsOrdered.get(i).getCategory() + " - "
                + (itemsOrdered.get(i).getCost() == 0 ? "Unknown" : itemsOrdered.get(i).getCost()) + "$");
    }
    sb.append("\nTotal cost: " + this.totalCost());
    sb.append("\n***************************************************");
    return sb.toString();
}
public void addMedia(Media media)
{
	if (qtyOrdered==20)
	{
		System.out.println("The cart is full");
	}
	else
	{
		itemsOrdered.add(media); 
		qtyOrdered++;
		System.out.println("The media has been added");
	}

	
}
 public void addMedia() {

        Media media =scandata.scanTitleFindMedia();
        addMedia(media);
    }
public void sortCartByTitleCost()
{
	itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
}
public void sortCartByCostTitle()
{
	itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
}
public void removeMedia(Media media)
{
	if(!itemsOrdered.contains(media))
	{
		System.out.println("No media exists");
	}
	else
	{
		itemsOrdered.remove(media);
		qtyOrdered--;
		System.out.println("The media has been removed");
	}
}
public void removeCartByID() {
    System.out.println("\nREMOVE CART BY ID");
    display();
    int id = scandata.scanID();
    removeMedia(FindMediaId(id));
}

public void removeCartByTitle() {
    System.out.println("\nREMOVE CART BY TITLE");
    display();
    String title = scandata.scanTitle();
    removeMedia(FindMediaTitle(title));
}
public void setQtyOrdered(int qtyOrdered) {
	this.qtyOrdered = qtyOrdered;

}

public Media FindMediaId(int ID)
{
	for (Media media : itemsOrdered) {
        if (media.getId() == ID) {
            return media;
        }
    }
    return null;
}
public Media FindMediaTitle(String title)
{
	for (Media media : itemsOrdered) {
        if (media.getTitle().equalsIgnoreCase(title)) {
            return media;
        }
    }
    return null;
}
public void display(){
	System.out.println(this.toString());
}
public float totalCost()
{
	float sum=0;
	for(int i=0;i<qtyOrdered;i++)
	{
		sum+=itemsOrdered.get(i).getCost();
	}
	return sum;
}
 public ArrayList<Media> filterMediaByTitle(String title) {
        ArrayList<Media> filteredMedia = new ArrayList<Media>();
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                filteredMedia.add(media);
            }
        }
        return filteredMedia;
    }

 public void displayFilterMediaByTitle() {
        System.out.println("FILTER MEDIA BY TITLE");
        System.out.println("-----------------------------------");
        String title = scandata.scanTitle();
        System.out.println(filterMediaByTitle(title).toString());
    }

 public ArrayList<Media> filterMediaById(int id) {
        ArrayList<Media> filteredMedia = new ArrayList<Media>();
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                filteredMedia.add(media);
            }
        }
        return filteredMedia;
    }
 public void displayFilterMediaById() {
        System.out.println("FILTER MEDIA BY ID");
        System.out.println("-----------------------------------");
        int id = scandata.scanID();
        System.out.println(filterMediaById(id).toString());
    }

 public void placeOrder() {
    System.out.println("\nPLACE ORDER");
    System.out.println("-----------------------------------");
    itemsOrdered.clear();
    System.out.println("Thank you for your purchase!");
}
}
