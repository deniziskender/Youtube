package youtube16;

public class Ornek2 {

	public static void main(String[] args) {
		String str = "deniz";
		tersiniYaz(str, str.length() - 1);
	}
	
	public static void tersiniYaz(String yazi,int sira) {
		if(sira >= 0) {
			System.out.print(yazi.charAt(sira));
			tersiniYaz(yazi, sira - 1);
		}
	}

}
