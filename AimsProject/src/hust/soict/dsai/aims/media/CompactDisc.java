package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks=new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track TrackName) {
		int i = 0;
    	for(Track track:tracks) {
    		i++;    
    		if (track.equals(TrackName)) {
    			break;
    		}
    	}
    	if(i==tracks.size()) {
    		tracks.add(TrackName);
    		System.out.println("The track has been added successfully");
    	}
    	else System.out.println("The track has been added before");
    }
	
	public void removeTrack(Track TrackName) {
		tracks.remove(TrackName);
		System.out.println("The track has been removed successfully");
	}
	
	public int getLength() {
		int sumLength=0;
		for(int i=0;i<tracks.size();i++) {
			sumLength+=tracks.get(i).getLength();
		}
		return sumLength;
		
	}
	
	public CompactDisc(String title,String category, float cost,int length, String director, String artist) {
		super( title,category, cost,length,director);
		this.artist = artist;
		
	}
	
	public void play()
	{
		for(Track track:tracks)
		{
			track.play();
		
		}
	}
}
