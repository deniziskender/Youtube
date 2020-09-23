package youtube15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvOkuma {

	public static void main(String[] args) throws FileNotFoundException {
		File dosya = new File("dosya.csv");
		if(dosya.exists()) {
			System.out.println("Bulundu.");
		} else {
			System.out.println("Bulunamadı.");
		}
		Scanner s = new Scanner(dosya);
		while(s.hasNextLine()) {
			String satir = s.nextLine();
			String[] split = satir.split(";");
			for(int i = 0; i < split.length; i++) {
				System.out.print(split[i] + " ");
			}
			System.out.println();
		}
		s.close();
		
	}
}
