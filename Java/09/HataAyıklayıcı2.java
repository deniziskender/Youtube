package youtube09;

public class HataAyıklayıcı2 {
	public static void main(String[] args) {
		String isim = "deniz";
		String tersi = "";
		int j = isim.length();
		while (j > 0) {
			tersi += isim.charAt(j);
			j--;
		}
		System.out.println("Tersi: " + tersi);
	}

}
