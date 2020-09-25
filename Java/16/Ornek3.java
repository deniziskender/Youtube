package youtube16;

public class Ornek3 {

	public static void main(String[] args) {
		int sonuc = faktoriel(2);
		System.out.println(sonuc);
	}

	public static int faktoriel(int k) {
		if (k > 0) {
			return k * faktoriel(k - 1); // özyinelemeli koşul
		} else {
			return 1; // bitirme koşu
		}
	}

}
