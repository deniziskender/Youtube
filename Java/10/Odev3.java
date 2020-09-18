package youtube10;

public class Odev3 {

	public static void main(String[] args) {
		String str = "radar";
		if(tersi(str)) {
			System.out.println("Tersi ile orijinali eşit.");
		} else {
			System.out.println("Tersi ile orijinali eşit değil.");
		}
	}

	public static boolean tersi(String orijinal) {
		String tersi = "";
		int j = orijinal.length() - 1;
		while (j >= 0) {
			tersi += orijinal.charAt(j);
			j--;
		}
		return orijinal.contentEquals(tersi);
	}
}
