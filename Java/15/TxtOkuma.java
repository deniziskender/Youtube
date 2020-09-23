package youtube15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtOkuma {

	public static void main(String[] args) throws FileNotFoundException {
		File dosya = new File("dosya.txt");
		if (dosya.exists()) {
			System.out.println("Bulundu.");
		} else {
			System.out.println("Bulunamadı.");
		}
		Scanner s = new Scanner(dosya);
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
	}
}
