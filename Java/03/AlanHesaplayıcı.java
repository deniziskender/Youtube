package youtube03;
/*
 * Yazar: Deniz İskender
 * Job: Com.Engineer
 *  
 */
public class AlanHesaplayıcı {
	
	public static void main(String[] args) {
		// division by zero;
		// remainder 

		// dairenin alanını
		// dikdörtgenin alanını
		// karenin alanını
		
		// Math.PI, Math.pow(), Math.min(), Math.max(), 
		// Math.abs(), Math.sqrt(), Math.sin(), Math.random(), Math.log(), 
		// Math.ceil(), Math.floor()
		
		double a = 10.0;
		int b = 20;
		
		double sum = (a + b);
		double diff = (a - b);
		double mul = (a * b);
		double div = (a / 0);
		
		System.out.println("Sum: " + sum);
		System.out.println("diff: " + diff);
		System.out.println("mul: " + mul);
		System.out.println("div: " + div);
		
		// System.out.println("div: " + (10 / 0));
		
		int c = 70;
		int d = 20;
		
		System.out.println("c%d: " + c%d);
		
		System.out.println();
		System.out.println("--------------Alan hesapları-------------");
		
		int r = 2;
		double PI = 3.14; 
		
		System.out.println("Dairenin alanı: " + PI * r * r);
		
		int x = 3;
		System.out.println("Karenin alanı: " + x * x);
		
		int y = 10;
		int z = 20;
		System.out.println("Dikdörtgenin alanı: " + y * z);
		
		// Math.PI, Math.pow(), Math.min(), Math.max(), 
		// Math.abs(), Math.sqrt(), Math.sin(), Math.random(), Math.log(), 
		// Math.ceil(), Math.floor()
		
		System.out.println("Dairenin yeni alanı: " + Math.PI * r * r);
		System.out.println("Karenin yeni alanı: " + Math.pow(x, 2));
		System.out.println();
		System.out.println("Min: " + Math.min(10, 20));
		System.out.println("Max: " + Math.max(10, 20));
		System.out.println("Abs: " + Math.abs(0));
		System.out.println("sqrt: " + Math.sqrt(4));
		System.out.println("sin: " + Math.sin(Math.toRadians(90)));
		System.out.println("random: " + Math.random());
		System.out.println("ceil: " + Math.ceil(2.00000001));
		System.out.println("ceil: " + Math.ceil(1.999999999));
	}
}
