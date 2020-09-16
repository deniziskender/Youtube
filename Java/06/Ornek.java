package youtube06;

public class Ornek {

	public static void main(String[] args) {
		String sehir = "Ankara";
		
		if(sehir.length() % 2 == 1) {
			System.out.println("Sehir stringinin uzunlugu tek sayı.");
			if(sehir.charAt(sehir.length() / 2) == 'm') {
				System.out.println("Ortadaki karakter m");
			} else {
				System.out.println("Ortadaki karakter m değil.");				
			}
		} else {
			System.out.println("Sehir stringinin uzunlugu çift sayı.");
			if(sehir.charAt(0) == sehir.charAt(sehir.length() -1)) {
				System.out.println("İlk ve son karakteri aynı");
			} else {
				System.out.println("İlk ve son karakteri aynı değil");
			}
		}
	}

}
