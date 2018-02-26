package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class hangagubben_latt {
	ArrayList<Ord> lättaOrd = new ArrayList<Ord>();
	ArrayList<Bokstav> Bokstav = new ArrayList<Bokstav>();
	
	public hangagubben_latt(File F) throws FileNotFoundException{
			Scanner filereader = new Scanner(F);
			while (filereader.hasNextLine()) {

				String line = filereader.nextLine();

				Ord ord = new Ord(line);

				lättaOrd.add(ord);
		}
			filereader.close();
	}


public void getRandomeWord(int i){

Collections.shuffle(lättaOrd);

	String e = lättaOrd.get(i);
	
	System.out.println(e);
	
	
	
}
}

