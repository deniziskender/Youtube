package youtube14;

import java.util.Random;

public class Ornek1 {
	static Random r = new Random();

	public static void main(String[] args) {
		int[] notlar = new int[5];
		for (int i = 0; i < notlar.length; i++) {
			notlar[i] = r.nextInt(101);
		}
		for (int i = 0; i < notlar.length; i++) {
			System.out.println(notlar[i]);
		}
		double toplam = 0.0;
		for (int i = 0; i < notlar.length; i++) {
			toplam += notlar[i];
		}
		double ortalama = toplam / notlar.length;
		System.out.println("Ortalama: " + ortalama);
		for (int i = 0; i < notlar.length; i++) {
			if (notlar[i] < ortalama)
				System.out.println("Dersten kalan not: " + notlar[i]);
		}
	}
}
