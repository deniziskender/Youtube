package youtube12;

import java.util.Random;

public class Rand {
	static Random r  = new Random();
	public static void main(String[] args) {
		System.out.println(r.nextBoolean());
		System.out.println(r.nextDouble());
		System.out.println(r.nextFloat());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(5));

		System.out.println(r.nextInt(5) + 10);
		
		int dogrularınSayisi = 0;
		int yanlislarınSayisi = 0;
		for(int i = 0; i < 100000000; i++) {
			boolean nextBoolean = r.nextBoolean();
			if(nextBoolean) {
				dogrularınSayisi++;
			} else {
				yanlislarınSayisi++;
			}
		}
		System.out.println("dogrularınSayisi: " + dogrularınSayisi);
		System.out.println("yanlislarınSayisi: " + yanlislarınSayisi);
	}

}
