package youtube05;

public class Stringler {
	public static void main(String[] args) {
		String str1 = " Deniz ";
		String str2 = "deniz";
		
		System.out.println("Eşit mi: " + str1.equals(str2));
		System.out.println("Eşit mi: " + str1.equalsIgnoreCase(str2));
		
		System.out.println("Index of z: " + str2.indexOf('z'));
		System.out.println("Length of str1: " + str1.length());
		
		System.out.println("Substring after index 2: " + str1.substring(2));
		System.out.println("Substring between index 2 and 4: " + str1.substring(2, 4)); // 2.parametre dahil dahil
		
		str1 = str1.toLowerCase();
		System.out.println(str1);
		System.out.println(str1.toUpperCase());
		
		System.out.println("Str1in bas harfi: " + str1.charAt(0));
		System.out.println("Trimden sonra: " + str1.trim());
		
		System.out.println(str1.replace('e', 'E'));

		System.out.println("--------------------ORNEK1-------------------");
		String isimVeSoyiyim = "Lebron James";
		System.out.println("Boslugun indexi: " + isimVeSoyiyim.indexOf(' '));
		String isim = isimVeSoyiyim.substring(0, isimVeSoyiyim.indexOf(' '));
		String soyisim = isimVeSoyiyim.substring(isimVeSoyiyim.indexOf(' ') + 1);
		
		System.out.println("Isim: " + isim);
		System.out.println("soyisim: " + soyisim);
		
		System.out.println("--------------------ORNEK2-------------------");
		String isimVeSoyiyimVeYas = "Lebron James 35";
		System.out.println("İlk boslugun indexi: " + isimVeSoyiyimVeYas.indexOf(' '));
		System.out.println("Son boslugun indexi: " + isimVeSoyiyimVeYas.lastIndexOf(' '));
		String isim2 = isimVeSoyiyimVeYas.substring(0, isimVeSoyiyimVeYas.indexOf(' '));
		System.out.println("isim2: " + isim2);
		
		String soyisim2 = isimVeSoyiyimVeYas.substring(isimVeSoyiyimVeYas.indexOf(' ') + 1, isimVeSoyiyimVeYas.lastIndexOf(' '));
		System.out.println("soyisim2: " + soyisim2);
		
		String yas = isimVeSoyiyimVeYas.substring(isimVeSoyiyimVeYas.lastIndexOf(' ') + 1);
		System.out.println("yas: " + yas);
		
		System.out.println("--------------------ORNEK3-------------------");
		String ornek3Str = "Anthony Davis";
		String ornek3Isim = ornek3Str.substring(0, ornek3Str.indexOf(' '));
		String ornek3Soyisim = ornek3Str.substring(ornek3Str.indexOf(' ') + 1);
		char isimİlkKarakter = ornek3Isim.charAt(0);
		char soyisimİlkKaraktter = ornek3Soyisim.charAt(0);
		
		System.out.println("Kısaltma: " + isimİlkKarakter + soyisimİlkKaraktter);
	}
}
