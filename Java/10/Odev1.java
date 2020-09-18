package youtube10;

public class Odev1 {

	public static void main(String[] args) {
		String isimVeSoyisim = "Deniz İskender";
		System.out.println("Kısaltma: " + kisaltma(isimVeSoyisim));

	}

	public static String kisaltma(String param) {
		int yer = param.indexOf(' ');
		String isim = param.substring(0, yer);
		String soyisim = param.substring(yer + 1, param.length() - 1);
		String kısaltma = isim.charAt(0) + ""; 
		kısaltma += soyisim.charAt(0) + "";
		return kısaltma;
	}
}
