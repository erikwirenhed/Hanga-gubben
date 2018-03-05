package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class main_hangagubben {
	ArrayList<HangmanWord> l�ttaOrd = new ArrayList<HangmanWord>();
	
	public static void main(String[] args) throws FileNotFoundException {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Gissa bokst�verna p� det hemliga ordet, men akta f�r om du gissar fel f�r m�nga g�nger s� blir gubben h�ng och d� �r spelet �ver. V�lj nu sv�rhetsgrad.");
	
	System.out.println("l�tt eller sv�r?");
	
	if(sc.nextLine().equals("l�tt")){
		
		
		Scanner filereader = new Scanner(new File("L�tta_ord.txt"));
		
		String line = filereader.nextLine();
		
		line.toUpperCase();
		
		HangmanWord wordSecret = new HangmanWord(line);
		
		
		while( !wordSecret.getWordString().equals(wordSecret.getSecretString())){
		
		System.out.println("Gissa p� en bokstav");
		
		System.out.println(wordSecret.getSecretString());
		
		String Guessword = sc.nextLine();
		
		char a = wordSecret.firstWord(Guessword);
		
		wordSecret.guess(a);
		}
		
		
		
			
		}
	
	else{
		System.out.println("hej");
		
Scanner filereader = new Scanner(new File("Sv�ra_ord.txt"));
		
		String line = filereader.nextLine();
		
		line.toUpperCase();
		
		HangmanWord wordSecret = new HangmanWord(line);
		
		
		while( !wordSecret.getWordString().equals(wordSecret.getSecretString())){
		
		System.out.println("Gissa p� en bokstav");
		
		System.out.println(wordSecret.getSecretString());
		
		String Guessword = sc.nextLine();
		
		char a = wordSecret.firstWord(Guessword);
		
		wordSecret.guess(a);
	}
}
}
}