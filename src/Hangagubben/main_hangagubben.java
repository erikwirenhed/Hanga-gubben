package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main_hangagubben {
	public static void main(String[] args) throws FileNotFoundException {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("L�tt eller sv�r?");
	
	if(sc.nextLine().equals("l�tt")){
		hangagubben_latt nyttSpel = new hangagubben_latt(new File("L�tta_ord.txt"));
		
		nyttSpel.getRandomeWord(0);
	}
	else{
		
	}
}
}