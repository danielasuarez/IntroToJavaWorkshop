package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
JOptionPane.showMessageDialog(null, "Who don't you like?");
String Name =JOptionPane.showInputDialog("Liza");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
	 
	JOptionPane.showMessageDialog(null, "You totally have a crush on " + Name);
		// 3. Ask the user for the name of their best friend
JOptionPane.showMessageDialog(null, "What is the name of your best friend?");
String Input =JOptionPane.showInputDialog("Liza");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, Input + "is as sweet as candy");
	} 
}



