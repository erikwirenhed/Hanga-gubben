package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main_hangagubben {
	public static void main(String[] args) throws FileNotFoundException {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Gissa bokst�verna p� det hemliga ordet, men akta f�r om du gissar fel f�r m�nga g�nger s� blir gubben h�ng och d� �r spelet �ver. V�lj nu sv�rhetsgrad.");
	
	System.out.println("l�tt eller sv�r?");
	
	if(sc.nextLine().equals("l�tt")){
		hangagubben_latt nyttSpel = new hangagubben_latt(new File("L�tta_ord.txt"));
	}
	else{
		
	}
}
}