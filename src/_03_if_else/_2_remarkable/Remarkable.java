package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	
	// 2. Ask the user to enter a name. Store their answer in a variable.
	String answer = JOptionPane.showInputDialog( "Enter your name here:");	
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (answer.equalsIgnoreCase("Marvin")) {
		JOptionPane.showMessageDialog(null, "You Can Code");
	}
	
	if (answer.equalsIgnoreCase("Mom")) {
		JOptionPane.showMessageDialog(null, "You Can't Code but your cool anyway");
	}
	
	}
}

