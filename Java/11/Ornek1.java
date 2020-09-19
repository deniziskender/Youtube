package youtube11;

import java.util.Scanner;

public class Ornek1 {
	static Scanner s = new Scanner(System.in);
	static int PI = 3;
	public static void main(String[] args) {
		System.out.println("Lütfen yarıcap giriniz: ");
		int yaricap = s.nextInt();
		alan(yaricap);
		cevre(yaricap);
	}
	
	public static void alan(int r) {
		System.out.println("Alan: " + PI * Math.pow(r, 2));
	}

	public static void cevre(int y) {
		System.out.println("Cevre: " + 2 * PI * y);
	}
}
