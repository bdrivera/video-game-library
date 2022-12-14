package ds.lab.two;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.text.DateFormatter;

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
 * VideoGameLibraryGUI defines the user interface used to manage the game library.
 * Extends JFrame for creating a GUI. Implements ActionListener to implement
 * functionality for buttons and Lists.
 * Many GUI elements have been generated by Netbeans' GUI editor. Most of the
 * logic used in the GUI was handwritten by myself.
 */
public class VideoGameLibraryGUI extends javax.swing.JFrame implements ActionListener {

	/**
	 * Creates new form VideoGameLibraryGUI
	 */
	public VideoGameLibraryGUI() {
		initComponents();
	}
	
	/**
	 * Override from ActionListener interface
	 * intended to be overridden by children
	 * @param e Action Event
	 */
	@Override
	public void actionPerformed(ActionEvent e) {}
	
	/**
	 * Adds an action listener to all buttons on the interface.
	 */
	public void addActionListeners() {
		for(Component c : addPanel.getComponents()) {
			if(c instanceof javax.swing.JButton) {
				((javax.swing.JButton)c).addActionListener(this);
			}
		}
		for(Component c : libraryPanel.getComponents()) {
			if(c instanceof javax.swing.JButton) {
				((javax.swing.JButton)c).addActionListener(this);
			}
		}
	}
		
	/**
	 * Getter method for Library List
	 * @return libraryList object
	 */
	public javax.swing.JList<String> getLibraryList() {
		return libraryList;
	}
	
	/**
	 * Getter method for Platform List
	 * @return platformList object
	 */
	public javax.swing.JList<String> getPlatformList() {
		return platformList;
	}
	
	/**
	 * Clears all the text user input fields in the GUI
	 */
	public void clearTextFields() {
		for(Component c : addPanel.getComponents()) {
			if(c instanceof javax.swing.JTextField) {
				((JTextField) c).setText("");
			}
		}
		
	}
	
	public void setLatestText(String toAppend) {
		latestLabel.setText(toAppend);
	}
	
	public String getTitleText() {
		return titleField.getText();
	}
	
	public String getDeveloperText() {
		return developerField.getText();
	}
	
	public String getPlatformText() {
		return platformField.getText();
	}
	
	public void clearPlatformText() {
		platformField.setText("");
	}
	
	public int getDayBox() {
		return Integer.parseInt((String)dayBox.getSelectedItem());
	}
	
	public int getMonthBox() {
		return monthBox.getSelectedIndex() + 1;
	}
	public int getYearBox() {
		return Integer.parseInt((String)yearBox.getSelectedItem());
	}

	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * CODE BELOW THIS POINT IS GENERATED BY NETBEANS BUILT IN GUI CREATOR TOOL*
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        libraryPanel = new javax.swing.JPanel();
        libraryDeleteBut = new javax.swing.JButton();
        libraryPane = new javax.swing.JScrollPane();
        libraryList = new javax.swing.JList<>();
        latestPane = new javax.swing.JScrollPane();
        latestLabel = new javax.swing.JTextArea();
        addPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        developerLabel = new javax.swing.JLabel();
        developerField = new javax.swing.JTextField();
        releaseLabel = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();
        dayBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        platformLabel = new javax.swing.JLabel();
        platformField = new javax.swing.JTextField();
        platformPane = new javax.swing.JScrollPane();
        platformList = new javax.swing.JList<>();
        platformAddBut = new javax.swing.JButton();
        platformDeleteBut = new javax.swing.JButton();
        gameAddBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Game Library Manager");

        libraryDeleteBut.setText("Delete");

        libraryList.setModel(new DefaultListModel());
        libraryPane.setViewportView(libraryList);

        latestLabel.setColumns(20);
        latestLabel.setRows(5);
        latestPane.setViewportView(latestLabel);

        javax.swing.GroupLayout libraryPanelLayout = new javax.swing.GroupLayout(libraryPanel);
        libraryPanel.setLayout(libraryPanelLayout);
        libraryPanelLayout.setHorizontalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(libraryPane)
                    .addGroup(libraryPanelLayout.createSequentialGroup()
                        .addComponent(latestPane, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(libraryDeleteBut)))
                .addContainerGap())
        );
        libraryPanelLayout.setVerticalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libraryPane, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(libraryDeleteBut, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(latestPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("Library", libraryPanel);

        titleLabel.setText("Title");

        developerLabel.setText("Developer");

        developerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developerFieldActionPerformed(evt);
            }
        });

        releaseLabel.setText("Release Date");

        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        platformLabel.setText("Platforms");

        platformList.setModel(new DefaultListModel());
        platformPane.setViewportView(platformList);

        platformAddBut.setText("Add");

        platformDeleteBut.setText("Remove");
        platformDeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platformDeleteButActionPerformed(evt);
            }
        });

        gameAddBut.setText("Add Game");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(releaseLabel)
                    .addComponent(platformLabel)
                    .addComponent(developerLabel)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameAddBut, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(platformPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(platformAddBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(platformDeleteBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(titleField, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(developerField, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(platformField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(developerLabel)
                    .addComponent(developerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(releaseLabel)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(platformLabel)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(platformField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(platformAddBut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(platformPane, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platformDeleteBut))
                .addGap(24, 24, 24)
                .addComponent(gameAddBut, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        for(int i = 1; i <= 31; i++) {
            dayBox.addItem(""+i);
        }
        for(int i = 1972; i <= Calendar.getInstance().get(Calendar.YEAR); i++) {
            yearBox.addItem(""+i);
        }

        tabPane.addTab("Add a Game", addPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane)
                .addContainerGap())
        );

        addActionListeners();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void developerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_developerFieldActionPerformed

    private void platformDeleteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platformDeleteButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platformDeleteButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JTextField developerField;
    private javax.swing.JLabel developerLabel;
    private javax.swing.JButton gameAddBut;
    private javax.swing.JTextArea latestLabel;
    private javax.swing.JScrollPane latestPane;
    private javax.swing.JButton libraryDeleteBut;
    private javax.swing.JList<String> libraryList;
    private javax.swing.JScrollPane libraryPane;
    private javax.swing.JPanel libraryPanel;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JButton platformAddBut;
    private javax.swing.JButton platformDeleteBut;
    private javax.swing.JTextField platformField;
    private javax.swing.JLabel platformLabel;
    private javax.swing.JList<String> platformList;
    private javax.swing.JScrollPane platformPane;
    private javax.swing.JLabel releaseLabel;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
