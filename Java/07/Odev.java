package youtube07;

public class Odev {
	public static void main(String[] args) {
		String isim = "deniz";
		
		String tersi = "";
		for(int i = isim.length() -1; i >= 0; i--) {
			tersi += isim.charAt(i);
		}
		System.out.println("İsim: " + isim);
		System.out.println("Tersi: " + tersi);
	}
}
