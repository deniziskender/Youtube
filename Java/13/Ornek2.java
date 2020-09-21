package youtube13;

public class Ornek2 {
	public static void main(String[] args) {
		String donusturucu1 = donusturucu1("Ocak");
		System.out.println(donusturucu1);

		String donusturucu2 = donusturucu2("Ocak");
		System.out.println(donusturucu2);
	}

	public static String donusturucu1(String ay) {
		switch (ay) {
		case "Ocak":
			return "Kıs";
		case "Subat":
			return "Kıs";
		case "Aralık":
			return "Kıs";
		default:
			return "Baska Mevsim";
		}
	}

	public static String donusturucu2(String ay) {
		if (ay.equals("Ocak") || ay.equals("Subat") || ay.equals("Aralık")) {
			return "Kış";
		} else {
			return "Baska Mevsim";
		}
	}
}
