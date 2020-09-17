package youtube08;

import java.util.Scanner;

public class Odev2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen pozitif sayı giriniz: ");
		int sayi = scan.nextInt();

		int toplam = 1;
		while (sayi >= 1) {
			toplam *= sayi;
			sayi--;
		}
		System.out.println("Çarpım: " + toplam);
		scan.close();
	}
}
