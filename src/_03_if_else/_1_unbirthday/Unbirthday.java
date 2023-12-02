package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog( "Hello User, when is your birthday?");	
		if (answer.equals("12/1/2010")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");	

		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday!");

		}
	}
}
