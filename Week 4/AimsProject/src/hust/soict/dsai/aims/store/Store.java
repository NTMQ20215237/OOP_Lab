package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;
import java.util.*;
public class Store {
	private int product_nums;
	private ArrayList<Media> itemsInStore= new ArrayList<Media>();
	public int getproductsnum()
	{
		return product_nums;
	}
	public void addMedia(Media media)
	{
		itemsInStore.add(media);
		product_nums++;
	}
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (itemsInStore.isEmpty()) {
            sb.append("The store is empty!");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                Media media = itemsInStore.get(i);
                sb.append((i + 1) + ". ID:" + media.getId() + "-" + media.getClass().getSimpleName() + ": "
                        + media.getTitle() + "-"
                        + media.getCategory() + "-" + media.getCost() + "$\n");
            }
        }
        return sb.toString();
    }
	public Media FindMediatitle(String title)
	{
		for(Media media :itemsInStore)
		{
			if(media.getTitle().equals(title))
			{
				return media;
			}
		}
		return null;
	}
	public void removeMedia(Media media)
	{
		if(!itemsInStore.contains(media))
		{
			System.out.println("No media exists");
		}
		else
		{
			product_nums--;
			itemsInStore.remove(media);
			System.out.println("The media has been removed");
		}
	
	}
	public void removeByID() {
        display();
        int id = scandata.scanID();
        removeMedia(findMediaById(id));
    }
	public Media findMediaById(int id) {
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                return media;
            }
        }
        return null;
    }
	public void removeByTitle() {
        display();
        String Title = scandata.scanTitle();
        removeMedia(findMediaByTitle(Title));
    }
	public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
	public void addDVD() {
        String title = scandata.scanTitle();
        String category = scandata.scanCategory();
        String director = scandata.scanDirector();
        int length = scandata.scanLength();
        float cost = scandata.scanCost();
        DigitalVideoDisc disc = new DigitalVideoDisc(  title,  category,  cost,  length,  director);
        addMedia(disc);
        

    }
	public void addBook() {
        
        String title = scandata.scanTitle(), category = scandata.scanCategory();
        float cost = scandata.scanCost();
        Book book = new Book(title, category, cost);
        addMedia(book);
        
    }

	public void addCD() {

        String title = scandata.scanTitle(), category = scandata.scanCategory(), director = scandata.scanDirector(),
                artist = scandata.scanArtist();
        int length = scandata.scanLength();
        float cost = scandata.scanCost();
        CompactDisc cd = new CompactDisc(title,category,  cost,  length,director,artist);
        addMedia(cd);


    }
	public void display(){

        System.out.println(this.toString());

	}
}