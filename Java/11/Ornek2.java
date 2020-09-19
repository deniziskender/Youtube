package youtube11;

import java.util.Scanner;

public class Ornek2 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Sehir giriniz: ");
		String sehir1 = s.next();
		// aksaray
		
		System.out.println("Sehir giriniz: ");
		String sehir2 = s.next();
		// sakarya
		
		boolean aynimi = true;
		for(int i = 0; i < sehir1.length(); i++) {
			char karakter1 = sehir1.charAt(i);
			boolean varmi = false;
			for(int j = 0; j < sehir2.length(); j++)  {
				char karakter2 = sehir1.charAt(j);
				if(karakter1 == karakter2) {
					varmi = true;
					break;
				}
			}
			if(!varmi) {
				aynimi = false;
				break;
			}
		}
		if(aynimi) {
			System.out.println("Aynı karakterlerden olusuyorlar.");
		} else {
			System.out.println("Aynı karakterlerden olusmuyorlar.");
		}
	}
}
