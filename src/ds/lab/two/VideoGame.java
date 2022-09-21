package ds.lab.two;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


/**
 * @curriculum CIS2168 Data Structures
 * @section 003
 * @student Bret Rivera tun03604@temple.edu
 * @assignment Assign2
 * 
 * Video Game Library Program
 * 
 * The Video Game Library program uses the Video Game class to define video
 * game objects, which are stored in LinkedLists. These lists can be manipulated
 * using a GUI interface to do tasks such as adding entries in alpha order and
 * deleting entries. It also displays the latest chronological release in the
 * library.
 * 
 * VideoGame class defines the information and object comparison methods for
 * a Video Game. Comparable is implemented to add standardization for it's use
 * in Lists and for comparisons.
 */
public class VideoGame implements Comparable<VideoGame> {

    //2.2.1 Entity Class - VideoGame
    
    private static final int DEFAULT_NUMBER_OF_PLATFORMS = 5;    

    //data fields
    private String title;
    private String developer;     //lead developer 
    private String platforms[];
    private LocalDate releaseDate;

    
	/**
	 * Displays VideoGame object as a String intended to be used in a 
	 * Video Game Library.
	 * @return String representation of VideoGame object.
	 */
    @Override
    public String toString() {
		String platformList = "";
		for(int i = 0; i < platforms.length; i++) {
			platformList += platforms[i];
			platformList += ((i != (platforms.length - 1)) ? ", " : "");
		}
		
        return title + " by " + developer +
				" for " + platformList + " released on " + getUsReleaseDate();
    }

	/**
	 * Compares this Video Game and another Video Game's titles to see if they
	 * are the same game.
	 * @param otherObject casted VideoGame to compare against
	 * @return boolean value of comparison between titles
	 */
    @Override
    public boolean equals(Object otherObject) {
		VideoGame otherGame = ((VideoGame)otherObject);
		return this.getTitle().equalsIgnoreCase(otherGame.getTitle());
	}
	
	/**
	 * Returns the Release Date variable formatted in standard US form
	 * @return US formatted release date
	 */
	public String getUsReleaseDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
		return dtf.format(getReleaseDate());
	}
    
    
    //******The following code don't need to be changed.*****//
    
    //You don't need to change this method.
    //This method is used in addVideoGameIn.
    @Override 
    public int compareTo(VideoGame other) {
        return this.title.compareTo(other.title);
    }   
    
    //no-argument constructor
    public VideoGame() {
        platforms = new String[DEFAULT_NUMBER_OF_PLATFORMS];
    }    
    
    //constructor taking in values for all data fields
    public VideoGame(String title, String developer, String[] platforms, LocalDate releaseDate) {
        this.title = title;
        this.developer = developer;
        this.platforms = platforms;
        this.releaseDate = releaseDate;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getDeveloper() {
        return developer;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }    
}
