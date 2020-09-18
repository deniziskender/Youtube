package youtube10;

public class Metod {

	public static void main(String[] args) {
		nothesapla(91);
		if(asal(11)) {
			System.out.println("Asal");
		} else {
			System.out.println("Asal değil");
		}
	}
	
	
	public static void nothesapla(int not) {
		if(not > 90 ) {
			System.out.println("Notun A.");
		} else if(not > 80) {
			System.out.println("Notun B.");
		} else if(not > 70) {
			System.out.println("Notun C.");
		}
	}
	
	public static boolean asal(int sayi) {
		for(int i = 2; i < sayi -1; i++) {
			if(sayi % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
