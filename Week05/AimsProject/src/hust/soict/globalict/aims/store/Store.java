package hust.soict.globalict.aims.store;

import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public Store() {
//		this.capacity=ca;
//		itemsInStore = new DigitalVideoDisc[ca];
	}
	public void addMedia(Media media) {
		if (!itemsInStore.contains(media)) {
			itemsInStore.add(media);
			System.out.println("The media has been added!");
		}else {
			System.out.println("The media has already existed!");
		}
	}
	public void removeMedia(Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
		}else {
			System.out.println("The media has been removed!");
		}
	}
	public Media search(int id) {
		for (Media media: itemsInStore) {
			if (media.getId()==id){
				System.out.println(media.toString());
				return media;
			}
		}
		System.out.println("No match is found!");
		return null;
	}
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	public Media search(String title) {
		for (Media media :itemsInStore) {
			if (media.getTitle().equals(title)){
				System.out.println(media.toString());
				return media;
			}
		}
		System.out.println("No match is found!");
		return null;
	}
}
