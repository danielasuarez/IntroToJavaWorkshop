package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
	
		String name = "Liza";
	JOptionPane.showMessageDialog(null,"Hello " + name);
	String usersName = JOptionPane.showInputDialog("Liza");
	JOptionPane.showMessageDialog(null, "Hello " + usersName);
	String Input = JOptionPane.showInputDialog("Name?"); 
	JOptionPane.showMessageDialog(null, "Hello " + Input);
}
	
	
	
	
	
	

}
