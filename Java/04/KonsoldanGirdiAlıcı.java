package youtube04;

import java.util.Scanner;

public class KonsoldanGirdiAlıcı {
	public static void main (String []  args) {
		Scanner s = new Scanner(System.in);
		/*
		System.out.println("Sinüsünün alınması için lütfen bir double değeri giriniz");
		double deger = s.nextDouble();
		System.out.println("Girilen değerin sinusu: " + Math.sin(Math.toRadians(deger)));
		
		System.out.println();
		System.out.println("Lütfen 2 tane sayı giriniz.");
		int numara1 = s.nextInt();
		int numara2 = s.nextInt();
		
		System.out.println("Girilen sayılardan büyük olanı: " + Math.max(numara1, numara2));
		
		System.out.println();
		System.out.print("Dairenin alanının hesaplanması için lütfen bir yarıçap giriniz: ");
		int r = s.nextInt();
		System.out.println("Yarıçapı " + r + " olan dairenin alanı: " + Math.PI * Math.pow(r , 2));
		
		System.out.println();
		*/
		
		System.out.println("Lütfen adınızı giriniz.");
		String isim = s.nextLine();
		char ilkKarakter = isim.charAt(4);
		System.out.println("Adınızın 4.harfi : " + ilkKarakter);
		s.close();
		
	}
}
