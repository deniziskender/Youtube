package youtube07;

public class ForDonguleri {
	public static void main(String[] args) {
		// for döngülerinde değişkeni kullanma
		int toplam = 0;
		for (int i = 1; i < 10; i = i + 2) {
			toplam += i;
		}
		System.out.println("toplam: " + toplam);

		// for döngüleriyle aynı işlemi tekrarlamak
		System.out.println("   *   ");
		System.out.println("  * *  ");
		System.out.println(" *   * ");
		System.out.println("*******");
		for (int i = 0; i <= 25; i++) {
			System.out.println("*     *");
		}
		System.out.println("*******");
	}
}
