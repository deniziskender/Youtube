package youtube14;

import java.util.Random;

public class Ornek2 {
	static Random r = new Random();

	public static void main(String[] args) {
		int[] notlar = new int[5];
		for (int i = 0; i < notlar.length; i++) {
			notlar[i] = r.nextInt(101);
		}
		for (int i = 0; i < notlar.length; i++) {
			System.out.print(notlar[i] + " ");
		}
		int maksimum = 0;
		int minimum = 101;
		for (int i = 0; i < notlar.length; i++) {
			if(notlar[i] > maksimum) {
				maksimum = notlar[i];
			}
			if(minimum > notlar[i]) {
				minimum =  notlar[i];
			}
		}
		System.out.println();
		System.out.println("Maksimum: " + maksimum);
		System.out.println("minimum: " + minimum);
	}

}
