package youtube14;

import java.util.Random;

public class Odev {
	static Random r = new Random();

	public static void main(String[] args) {
		int[] sayilar = new int[10];
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = r.nextInt(5);
		}
		print(sayilar);
		int sira = bul(sayilar, 4);
		System.out.println("Sira: " + sira);
	}

	public static int bul(int[] sayilar, int arananSayi) {
		System.out.println("Arana sayi: " + arananSayi);
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == arananSayi) {
				return i;
			}
		}
		return -1;
	}

	public static void print(int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print(sayilar[i] + " ");
		}
		System.out.println();
	}

}
