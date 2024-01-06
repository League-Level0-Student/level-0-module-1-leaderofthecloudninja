package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("Who coded this project?");
		if (riddle1.equalsIgnoreCase("Marvin")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
			JOptionPane.showMessageDialog(null,"score:" + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is: Marvin");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("What has many keys but no lock?");
		if (riddle2.equalsIgnoreCase("A Piano")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
			JOptionPane.showMessageDialog(null,"score:" + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is: A Piano");
		}
		
		String riddle3 = JOptionPane.showInputDialog("What has to be broken before you can use it?");
		if (riddle3.equalsIgnoreCase("An Egg")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
			JOptionPane.showMessageDialog(null,"score:" + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is: An Egg");
		}
		// 2. Make a pop up to show the score.
		
	}
}

