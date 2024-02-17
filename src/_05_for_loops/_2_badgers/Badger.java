package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badger {
public static void main(String[] args) {
	for(int i=0; i<12; i++){
		System.out.print("Badger");
		if(i<=10) {System.out.print(", ");}
		for(int i=0; i<12; i++){
		System.out.print("Mushroom");
		if(i<=10) {System.out.print(", ");}
	}
}
}

///Use for loops (you will need more than one) to print the following lyrics from the Badger Song. You can only use the words “Badger”, “Mushroom” and “Snake” once each in your code.
//
////Print 2 verses of the song as follows:
//
//Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger, Badger, Badger
//Mushroom, Mushroom
//
//Badger, Badger, Badger,Badger, Badger, Badger, Badger,Badger, Badger, Badger, Badger, Badger
//Mushroom, Mushroom
//
//A Snake!!!