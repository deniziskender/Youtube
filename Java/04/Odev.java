package youtube04;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Lütfen doğum yılınızı giriniz. ");
		int dogumYılı = s.nextInt();
		System.out.println("Yaşınız: " + (2020 - dogumYılı));
		System.out.println();

		System.out.println("Lütfen 2 tane tam sayı giriniz.");
		int numara1 = s.nextInt();
		int numara2 = s.nextInt();
		System.out.println("Girdiğiniz sayılardan küçük olanı : " + Math.min(numara1, numara2));
		System.out.println();
		
		System.out.println("Lütfen adınızı giriniz.");
		String isim = s.next();
		int sonKarakterinSırası = isim.length() - 1;
		System.out.println("İsminizin son harfi: " + isim.charAt(sonKarakterinSırası));
		s.close();

	}

}
