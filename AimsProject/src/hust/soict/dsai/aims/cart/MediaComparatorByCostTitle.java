package hust.soict.dsai.aims.cart;

import java.util.Comparator;
import hust.soict.dsai.aims.media.*;
public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		if(Float.compare(o1.getCost(),o2.getCost())==0)
		{
			return o1.getTitle().compareTo(o2.getTitle());
		}
		else
		{
			return (Float.compare(o1.getCost(),o2.getCost()));
		}
	}

}
