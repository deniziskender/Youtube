package youtube14;

import java.util.Arrays;

public class Diziler {
	public static void main(String[] args) {
		int [] sayilar = new int[5];
		print(sayilar);
		sayilar[0] = 99;
		print(sayilar);
		// System.out.println(sayilar[-1]);
		System.out.println("--------------------------");
		// System.out.println(sayilar[5]);
		System.out.println("--------------------------");
		System.out.println(sayilar[0]);
		
		for(int i = 0; i < sayilar.length; i++) {
			sayilar[i] = i * 5;
		}
		print(sayilar);
		
		int[] sayilar2 = {11, 12, 99, 5, 1};
		print(sayilar2);
		int sira = Arrays.binarySearch(sayilar2, 99);
		System.out.println("--------------------------");
		System.out.println("Sira: " + sira);
		
		Arrays.sort(sayilar2);
		print(sayilar2);
	}
	
	public static void print(int[] sayilar) {
		System.out.println("--------------------------");
		for(int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
	}
}
