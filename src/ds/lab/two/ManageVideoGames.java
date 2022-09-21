package ds.lab.two;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.DefaultListModel;

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
 * ManageVideoGames manages the Video Game Library and contains methods used
 * to interact between the Game Library and the User Interface. Implements
 * VideoGameLibraryGUI which is the User Interface used to manage the library.
 */
public class ManageVideoGames extends VideoGameLibraryGUI {

	private LinkedList<VideoGame> gameLibrary;
	
	/**
	 * Creates a gameLibrary LinkedList.
	 */
	public ManageVideoGames() {
		gameLibrary = new LinkedList();
	}
	
    public static void main(String[] args) {
		ManageVideoGames mvg = new ManageVideoGames();
        mvg.displayMenu();

    }

	/**
	 * Displays the GUI
	 */
    public void displayMenu() {
		setVisible(true);
    }    

	/**
	 * Overrides actionPerformed from parent.
	 * Passes parameters passed from button presses.
	 * @param e event object from user interaction.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			//System.out.println(((JButton)e.getSource()).getText()); //For debugging
			getUserChoice(((JButton)e.getSource()).getText());
		} catch(Exception ex) {
			System.out.println("Error caught: " + ex.getClass());
		}
	}
	
	/**
	 * Takes button parameters and takes appropriate actions
	 * @param buttonText text on button. Used to differentiate buttons.
	 */
    public void getUserChoice(String buttonText) {
		switch(buttonText.toLowerCase()) {
			case "delete" -> { //Deletes selected game from library
				int selectIndex = getLibraryList().getSelectedIndex();
				gameLibrary.remove(selectIndex);
				updateLibrary();
			}
			
			case "add game" -> { //Adds user input game into library
				VideoGame newGame = getNewGame();
				if(newGame == null) { //Weed out nulls
					return;
				}
				
				for(VideoGame g : gameLibrary) { //If you try and add a repeat
					if(newGame.equals(g)) {
						return;
					}
				}
				
				for(int i = 0; i < gameLibrary.size(); i++) { //Adds game in alphabetically
					if(newGame.compareTo(gameLibrary.get(i)) < 0) {
						gameLibrary.add(i, newGame);
						clearTextFields();
						updateLibrary();
						return;
					}
				}
				
				gameLibrary.add(newGame); //If the game is last alphabetically
				clearTextFields();
				updateLibrary();
			}
			
			case "add" -> { //Adds user input Platform to the platform list
				if(!getPlatformText().equals("")) {
					getPlatformModel().addElement(getPlatformText());
					clearPlatformText();
				}
			}
			
			case "remove" -> { //Removes a Platform from the platform list
				int selectIndex = getPlatformList().getSelectedIndex();
				getPlatformModel().removeElementAt(selectIndex);
			}
			
		}
    }
	
	/**
	 * Clears all elements from the model for the Game Library and readds the
	 * elements from the Game Library LinkedList. Also requests updates for the
	 * display for the chronologically latest game release.
	 */
	public void updateLibrary() {
		getLibraryModel().clear();
		for(VideoGame v : gameLibrary) {
			getLibraryModel().addElement(v.toString());
		}
		updateLatest();
	}
	
	/**
	 * Finds the chronologically latest release from the game library and
	 * updates the latest release text to reflect the latest game. Uses
	 * Date libraries to manage date handling
	 */
	public void updateLatest() {
		VideoGame latestVG = gameLibrary.get(0);
		for(VideoGame v : gameLibrary) {
			if(v.getReleaseDate().compareTo(latestVG.getReleaseDate()) > 0) {
				latestVG = v;
			}
		}
		setLatestText("Latest Release:\n" + latestVG.toString());
	}
	
	/**
	 * Getter for the DefaultListModel for the platform ListBox.
	 * @return DefaultListModel for platform ListBox.
	 */
	public DefaultListModel getPlatformModel() {
		return ((DefaultListModel)getPlatformList().getModel());
	}
	
	/**
	 * Getter for the DefaultListModel for the library ListBox
	 * @return DefaultListModel for library ListBox.
	 */
	public DefaultListModel getLibraryModel() {
		return ((DefaultListModel)getLibraryList().getModel());
	}
	
	/**
	 * Returns the user input platforms from the GUI ListBox as a String array.
	 * @return platforms as a String Array.
	 */
	public String[] getPlatformArray() {
		String[] platforms = new String[getPlatformModel().getSize()];
		for(int i = 0; i < platforms.length; i++) {
			platforms[i] = (String)getPlatformModel().getElementAt(i);
		}
		
		return platforms;
	}
    
	/**
	 * Takes user input from the GUI, creates, and returns a new VideoGame object
	 * using the user input information. Returns null if user left input fields
	 * empty.
	 * @return New VideoGame object created using user input or null if missing
	 * user input.
	 */
    public VideoGame getNewGame() {
		if(!getTitleText().equals("") && !getDeveloperText().equals("")) {
			VideoGame newGame = 
					new VideoGame(getTitleText(),getDeveloperText(), getPlatformArray(),
							LocalDate.of(getYearBox(), getMonthBox(), getDayBox()));
			return newGame;
		}
		return null;
    }     

}
