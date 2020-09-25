package youtube16;

public class Özyineleme {

	public static void main(String[] args) {
		int sonuc = toplam(10);
		System.out.println(sonuc);
	}

	public static int toplam(int k) {
		if (k > 0) {
			return k + toplam(k - 1); // özyinelemeli koşul
		} else {
			return 0; // bitirme koşu
		}
	}
}
