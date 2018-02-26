package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main_hangagubben {
	public static void main(String[] args) throws FileNotFoundException {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Lätt eller svår?");
	
	if(sc.nextLine().equals("lätt")){
		hangagubben_latt nyttSpel = new hangagubben_latt(new File("Lätta_ord.txt"));
		
		nyttSpel.getRandomeWord(0);
	}
	else{
		
	}
}
}