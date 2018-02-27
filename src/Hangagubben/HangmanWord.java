package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanWord {
	/*ArrayList<HangmanWord> lättaOrd = new ArrayList<HangmanWord>();*/
	private final String word;
	private String secret;
	
	/*public void HnagmanWord(File F) throws FileNotFoundException{
		Scanner filereader = new Scanner(F);
		while (filereader.hasNextLine()) {

			String line = filereader.nextLine();

			Ord ord = new Ord(line);

			lättaOrd.add(ord);
	}
		filereader.close();
}*/
	
	public HangmanWord(String word){
		this.word = word.toUpperCase();
		this.secret = "";
		for (int i = 0; i < word.length(); i++) {
			this.secret += "-";
		}
		System.out.println("SKAPADE NYTT HangmanWord: " + this.word);
	}
	
	public void guess(char c){
		c = Character.toUpperCase(c);
		String newSecret = "";
		for (int i = 0; i < word.length(); i++) {
			char w = word.charAt(i);
			if(w == c){
				newSecret += c;
			}
			else {
				newSecret += secret.charAt(i);
			}			
		}

		secret = newSecret;
		
	}
	
	public String getSecretString(){
		return secret;
	}
		
}
