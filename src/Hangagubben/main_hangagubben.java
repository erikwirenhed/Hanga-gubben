package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class main_hangagubben {
	ArrayList<HangmanWord> lättaOrd = new ArrayList<HangmanWord>();
	
	public static void main(String[] args) throws FileNotFoundException {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Gissa bokstäverna på det hemliga ordet, men akta för om du gissar fel för många gånger så blir gubben häng och då är spelet över. Välj nu svårhetsgrad.");
	
	System.out.println("lätt eller svår?");
	
	if(sc.nextLine().equals("lätt")){
		
		
		Scanner filereader = new Scanner(new File("Lätta_ord.txt"));
		
		String line = filereader.nextLine();
		
		line.toUpperCase();
		
		HangmanWord wordSecret = new HangmanWord(line);
		
		
		while( !wordSecret.getWordString().equals(wordSecret.getSecretString())){
		
		System.out.println("Gissa på en bokstav");
		
		System.out.println(wordSecret.getSecretString());
		
		String Guessword = sc.nextLine();
		
		char a = wordSecret.firstWord(Guessword);
		
		wordSecret.guess(a);
		}
		
		
		
			
		}
	
	else{
		System.out.println("hej");
		
Scanner filereader = new Scanner(new File("Svåra_ord.txt"));
		
		String line = filereader.nextLine();
		
		line.toUpperCase();
		
		HangmanWord wordSecret = new HangmanWord(line);
		
		
		while( !wordSecret.getWordString().equals(wordSecret.getSecretString())){
		
		System.out.println("Gissa på en bokstav");
		
		System.out.println(wordSecret.getSecretString());
		
		String Guessword = sc.nextLine();
		
		char a = wordSecret.firstWord(Guessword);
		
		wordSecret.guess(a);
	}
}
}
}