package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badger {
	public static void main(String[] args) {
		for (int Meh = 0; Meh < 2; Meh++) {
			for (int Badger = 0; Badger < 12; Badger++) {
				System.out.print("Badger");
				if (Badger <= 10) {
					System.out.print(", ");

				}

			}
			System.out.println();
			for (int i = 0; i < 2; i++) {
				System.out.print("Mushroom");
				if (i < 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		System.out.print("A Snake! ");
	}
}

/// Use for loops (you will need more than one) to print the following lyrics
/// from the Badger Song. You can only use the words “Badger”, “Mushroom” and
/// “Snake” once each in your code.
//
//// Print 2 verses of the song as follows:
//
// Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger,
/// Badger, Badger
// Mushroom, Mushroom
//
// Badger, Badger, Badger,Badger, Badger, Badger, Badger,Badger, Badger, Badger,
/// Badger, Badger
// Mushroom, Mushroom
//
// A Snake!!!