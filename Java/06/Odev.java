package youtube06;

public class Odev {
	public static void main(String[] args) {
		int not = 66;

		// A
		if (not >= 90) {
			System.out.println("A.");
		}

		// B+, B, B-
		else if (not >= 80) {
			if (not > 85) {
				System.out.println("B+.");
			} else if (not == 85) {
				System.out.println("B.");
			} else {
				System.out.println("B-.");
			}
		}

		// C+, C, C-
		else if (not >= 70) {
			if (not > 75) {
				System.out.println("C+.");
			} else if (not == 75) {
				System.out.println("C.");
			} else {
				System.out.println("C-.");
			}
		}

		// D+, D
		else if (not >= 60) {
			if (not > 65) {
				System.out.println("D+.");
			} else {
				System.out.println("D.");
			}
		}
	}
}
