package youtube11;

import java.util.Scanner;

public class Odev {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int adet = 0;
		double toplam = 0;

		while (true) {
			System.out.print("Tam sayı giriniz: ");
			int sayi = s.nextInt();
			if (sayi == 0) {
				break;
			}
			adet++;
			toplam += sayi;

			System.out.println("Suana kadarki toplam:  " + toplam);
			System.out.println("Toplam girilen adeti: " + adet);
			System.out.println("Ortalama: " + toplam / adet);
			System.out.println();

		}
		System.out.println("Program durduruldu.");
	}
}
