package youtube16;

public class Odev2 {

	public static int üs(int x, int y) {
		if (y == 0)
			return 1;
		else
			return x * üs(x, y - 1);
	}

	public static void main(String[] args) {
		System.out.println("2 ^ 3: " + üs(2, 3));
		System.out.println("4 ^ 5: " + üs(4, 5));
	}

}
