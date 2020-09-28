import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class VeriTabani {
	static Scanner konsol = new Scanner(System.in);
	static int kullanıcıSayısı = 0;

	public static void main(String[] args) throws IOException {
		System.out.println("Hoşgeldiniz");
		System.out.println("Kayıt olmak için 1");
		System.out.println("Giriş yapmak için 2");
		System.out.println("Çıkış yapmak için 3");
		int secenek = konsol.nextInt();
		switch (secenek) {
		case 1:
			kayıtOl();
			break;
		case 2:
			System.out.println("Lütfen kullanıcı adı giriniz: ");
			String kullanıcıAdı = konsol.next();

			System.out.println("Lütfen şifre giriniz: ");
			String şifre = konsol.next();
			boolean girişYap = girişYap(kullanıcıAdı, şifre);
			if(girişYap) {
				System.out.println("Başarılı bir şekilde giriş yaptınız, " + kullanıcıAdı);
				şifreDeğiştir(kullanıcıAdı);
			} else {
				System.out.println("Böyle bir kullanıcı bulunamadı.");
			}
			break;
		case 3:
			System.out.println("İyi günler dileriz.");
			break;
		default:
			System.out.println("Yanlıs bir tuşa bastınız");
			break;
		}
	}

	private static void şifreDeğiştir(String kullanıcıAdı) throws IOException {
		System.out.println("Buradan sadece şifre değiştirme işlemleri yapılabilir.");
		System.out.println("Lütfen yeni şifrenizi giriniz.");
		String yeniŞifre = konsol.next();
		
		String [] kullanicilar = new String[kullanıcıSayısı];
		File dosya = new File("kullanicilar.csv");
		Scanner s = new Scanner(dosya);
		
		int sira = 0;
		while(s.hasNextLine()) {
			String satir = s.nextLine();
			String[] split = satir.split(";");
			for(int i = 0; i < split.length; i++) {
				if(i == 0) {
					if(split[0].equals(kullanıcıAdı)) {
						kullanicilar[sira] = satirinYeniHali(satir, yeniŞifre);
					} else {
						kullanicilar[sira] = satir;
					}
				}
			}
			sira++;
		}
		s.close();
		dosyayaYaz(kullanicilar);
	}
	
	
	
	private static void dosyayaYaz(String[] kullanicilar) throws IOException {
		Writer r = new FileWriter("kullanicilar.csv");
		for (int i = 0; i < kullanicilar.length; i++) {
			r.write(kullanicilar[i] + "\n");
		}
		
		r.close();		
	}

	public static String satirinYeniHali(String eskiHali, String yeniSifre) {
		String[] split = eskiHali.split(";");
		split[1] = yeniSifre;
		String yeniHali = "";
		for (int i = 0; i < split.length; i++) {
			yeniHali += split[i] + ";";
		}
		return yeniHali;
	}

	public static void kayıtOl() throws IOException {
		System.out.println("Lütfen kullanıcı adı giriniz: ");
		String kullanıcıAdı = konsol.next();

		System.out.println("Lütfen şifre giriniz: ");
		String şifre = konsol.next();

		System.out.println("Lütfen adınızı giriniz: ");
		String isim = konsol.next();

		System.out.println("Lütfen soyadınızı giriniz: ");
		String soyad = konsol.next();

		Writer r = new FileWriter("kullanicilar.csv", true);
		r.write(kullanıcıAdı + ";" + şifre + ";" + isim + ";" + soyad + "\n");
		r.close();
		
		System.out.println("Başarılı bir şekilde kayıt oldunuz.");

	}

	public static boolean girişYap(String kullanıcıAdı, String şifre) throws FileNotFoundException {
		File dosya = new File("kullanicilar.csv");
		Scanner s = new Scanner(dosya);
		
		boolean başarılımı = false;
		while(s.hasNextLine()) {
			kullanıcıSayısı++;
			String satir = s.nextLine();
			String[] split = satir.split(";");
			String veritabanıKullanıcıAdı = "";
			String veritabanıŞifre = "";
			for(int i = 0; i < split.length; i++) {
				if(i == 0) {
					veritabanıKullanıcıAdı = split[0];
				} else if(i == 1) {
					veritabanıŞifre = split[1];
				}
			}
			if(veritabanıKullanıcıAdı.equals(kullanıcıAdı) && şifre.equals(veritabanıŞifre)) {
				başarılımı = true;
			}
		}
		s.close();
		if(başarılımı) {
			return true;
		} else {
			return false;
		}
	}
}
