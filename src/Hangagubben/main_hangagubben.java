package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main_hangagubben {
	public static void main(String[] args) throws FileNotFoundException {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Gissa bokstäverna på det hemliga ordet, men akta för om du gissar fel för många gånger så blir gubben häng och då är spelet över. Välj nu svårhetsgrad.");
	
	System.out.println("lätt eller svår?");
	
	if(sc.nextLine().equals("lätt")){
		hangagubben_latt nyttSpel = new hangagubben_latt(new File("Lätta_ord.txt"));
	}
	else{
		
	}
}
}