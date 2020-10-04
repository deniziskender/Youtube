package Proje02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Odev1 {
	static Scanner konsol = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Lütfen geçerli bir mail adresi giriniz.");
		String mailAdresi = konsol.nextLine();

		File dosya = new File("sinavsorulariodev1.csv");
		Scanner s = new Scanner(dosya);

		// soruları alma kısmı
		String[] sorular = new String[10];
		int i = 0;
		while (s.hasNextLine()) {
			String satir = s.nextLine();
			sorular[i] = satir;
			i++;
		}
		s.close();

		sorular = shuffleArray(sorular);

		int dogruSayisi = 0;
		for (int j = 0; j < sorular.length; j++) {
			String[] split = sorular[j].split(";");
			String[] şıklarKarışık = şıklarıKarıştır(split);
			System.out.println("Soru " + (j + 1) + ": " + split[0]);

			String sıklar = "";
			sıklar += "A) " + şıklarKarışık[0] + " B) " + şıklarKarışık[1];
			if (!split[3].equals("")) {
				sıklar += " C) " + şıklarKarışık[2];
			}

			if (!split[4].equals("")) {
				sıklar += " D) " + şıklarKarışık[3];
			}

			System.out.println(sıklar);

			String cevap = konsol.nextLine();
			if (cevap.equals(split[5])) {
				System.out.println("Dogru.");
				dogruSayisi++;
			} else {
				System.out.println("Yanlış.");
			}
			System.out.println();
		}
		dosyayaYaz(mailAdresi, dogruSayisi);
	}

	private static String[] şıklarıKarıştır(String[] split) {
		String[] şıklar = new String[4];
		şıklar[0] = split[1];
		şıklar[1] = split[2];
		şıklar[2] = split[3];
		şıklar[3] = split[4];
		String[] şıklarKarışık = shuffleArray(şıklar);
		return şıklarKarışık;
	}

	// Implementing Fisher–Yates shuffle
	static String[] shuffleArray(String[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			String a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
		return ar;
	}

	public static void dosyayaYaz(String mailAdresi, int dogruSayısı) throws IOException {
		Writer r = new FileWriter("denemeler.csv", true);
		r.write(mailAdresi + ";" + dogruSayısı + "\n");
		r.close();
	}
}
