package youtube13;

public class Odev {
	public static void main(String[] args) {
		String beden = donusturucu(4);
		System.out.println(beden);
	}

	public static String donusturucu(int beden) {
		switch (beden) {
		case 1:
			return "s";
		case 2:
			return "m";
		case 3:
			return "l";
		case 4:
			return "xl";
		default:
			return "";
		}
	}
}
