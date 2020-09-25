package youtube16;

public class Ornek1 {

	public static void main(String[] args) {
		print(10);
	}

	public static void print(int k) {
		if (k >= 0) {
			System.out.println(k);
			print(k - 1);
		}
	}

}
