package youtube08;

import java.util.Scanner;

public class WhileDöngüleri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1'den 10'a kadar tek sayı toplamı
		int i = 1;
		int sum = 0;
		while (i < 10) {
			sum += i;
			System.out.println("i: " + i);
			i = i + 2;
		}
		System.out.println("sum: " + sum);

		// string tersi
		String isim = "deniz";
		String tersi = "";
		int j = isim.length() - 1;
		while (j >= 0) {
			tersi += isim.charAt(j);
			j--;
		}
		System.out.println("Tersi: " + tersi);

		// ornek 3
		int toplam = 0;
		while (true) {
			System.out.println("Lütfen sayı giriniz: ");
			int sayi = scan.nextInt();
			if (sayi == 0) {
				break;
			}
			toplam += sayi;
		}
		System.out.println("Toplam: " + toplam);
	}
}
