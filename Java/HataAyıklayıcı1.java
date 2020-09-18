package youtube09;

import java.util.Scanner;

public class HataAyıklayıcı1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int negatifSayilar = 0;
		int pozitifSayilar = 0;
		while (true) {
			System.out.println("Lütfen sayı giriniz: ");
			int sayi = scan.nextInt();
			if (sayi == 0) {
				break;
			} else if (sayi < 0) {
				pozitifSayilar += 1;
			} else {
				negatifSayilar += 1;
			}
		}
		System.out.println("Girilen pozitif sayılar " + pozitifSayilar + " tanedir");
		System.out.println("Girilen negatif sayılar " + negatifSayilar + " tanedir");
		scan.close();
	}

}
