package Hangagubben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class hangagubben_latt {
	ArrayList<Ord> lättaOrd = new ArrayList<Ord>();
		
	public hangagubben_latt(File F) throws FileNotFoundException{
			Scanner filereader = new Scanner(F);
			while (filereader.hasNextLine()) {

				String line = filereader.nextLine();

				Ord ord = new Ord(line);

				lättaOrd.add(ord);
		}
			filereader.close();
	}
}
