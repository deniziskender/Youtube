package youtube12;

import java.util.Random;
import java.util.Scanner;

public class Ornek {
	static Random r = new Random();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int rastgeleSayi = r.nextInt(100) + 1;
		while (true) {
			System.out.println("Sayıyı tahmin ediniz: ");
			int tahmin = s.nextInt();
			if (tahmin > rastgeleSayi) {
				System.out.println("Aşağı");
			} else if (tahmin < rastgeleSayi) {
				System.out.println("Yukarı");
			} else {
				System.out.println("Dogru tahmin.");
				break;
			}
		}
	}

}
