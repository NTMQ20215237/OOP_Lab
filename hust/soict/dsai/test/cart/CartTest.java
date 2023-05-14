package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class CartTest {

	public static void main(String[] args) {
//Create new cart
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers",87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
	
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War",
				"Science Fiction","George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		//Test the print method
		cart.display();
		//Test the searching method by title here
		cart.TitleChecking("Star War");
		cart.TitleChecking("The Snow Queen");
		//Test the searching method by ID here
		cart.IDchecking(3);
		cart.IDchecking(5);
	}

}
