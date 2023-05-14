package hust.soict.dsai.aims;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;

public class Aims {

	public static void main(String[] args) {
//Create a new cart
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers",87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War",
				"Science Fiction","George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvdList[]= {dvd2,dvd3};
		anOrder.addDigitalVideoDisc(dvdList);
		anOrder.display();
		anOrder.removeDigitalVideoDisc(dvd1);
		anOrder.removeDigitalVideoDisc(dvd3);
		anOrder.display();
		anOrder.addDigitalVideoDisc(dvd1, dvd3);
		anOrder.display();
		//print total cost of the items in the cart
		System.out.println("Total Cost is:");
		System.out.println(anOrder.totalCost());
		//remove items in the cart
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("The item \"dvd1\" has just been removed from the cart.!");
        anOrder.display();

	}

}
