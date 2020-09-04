package youtube03;

/*
 * Bu program 4.0 üzerinden not ortlaması hesaplar.
 * Yazar: Deniz İskender
 */
public class OrtlamaHesaplayıcı {
	public static void main(String[] args) {
		// a, b, c, d, f
		// 4, 3, 2, 1, 0

		// Saatler  ->  (6)     (6)       (6)      (2)
		// Dersler  -> CS101, MATH101, PHYSC101, SWIM101
		// Notlarım ->   A,      B,       C,       A

		
		double A = 4.0;
		double B = 3.0;
		double C = 2.0;
		
		double CS101Puan = A * 6;
		double MathPuan = B * 6;
		double Physc101Puan = C * 6;
		double Swim101Puan = A * 2;
		
		double toplamPuan = CS101Puan + MathPuan + Physc101Puan + Swim101Puan;
		int toplamSaat = 6 + 6 + 6 + 4;
		double ortalama = toplamPuan / toplamSaat;
		
		System.out.println(ortalama);
	}
}
