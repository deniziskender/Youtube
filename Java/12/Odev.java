package youtube12;

import java.util.Random;

public class Odev {
	static Random r = new Random();

	public static void main(String[] args) {
		int toplam = 0;
		while (toplam != 11) {
			int zar1 = r.nextInt(6) + 1;
			int zar2 = r.nextInt(6) + 1;
			toplam = zar1 + zar2;
			System.out.println("Zar1: " + zar1 + " zar2: " + zar2 + " toplam: " + toplam);
		}
	}
}
