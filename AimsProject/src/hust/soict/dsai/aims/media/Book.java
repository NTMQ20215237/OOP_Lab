package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
   
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		int i = 0;
    	for(String name:authors) {
    		i++;    
    		if (name.equals(authorName)) {
    			break;
    		}
    	}
    	if(i==authors.size())authors.add(authorName);
    }
	 public void removeAuthor(String authorName) {
	            authors.remove(authorName);
	 }    
}
