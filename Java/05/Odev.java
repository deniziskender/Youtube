package youtube05;

public class Odev {

	public static void main(String[] args) {
		String str1 = " Lebron James 35 ";
		String str2 = " Anthony Davis 27 ";

		// stringlerin basındaki ve sonundaki boslukları kaldırdık.
		str1 = str1.trim(); 
		str2 = str2.trim();

		// stringleri küçük harflere çevirdik.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// 1. ve 2.bosluğu bularak stringleri parçaladık.
		int indexOf = str1.indexOf(' '); // ilk boslugun indexi
		int lastIndexOf = str1.lastIndexOf(' '); // ikinci boslugun indexi
		String isim = str1.substring(0, indexOf); // stringin basından ilk bosluga kadar olan kısım
		String soyisim = str1.substring(indexOf + 1, lastIndexOf); // ilk bosluk ve 2.bosluk arasında olan kısım
		String yas = str1.substring(lastIndexOf + 1); // 2.bosluktan stringin sonuna kadar olan kısım

		int indexOf2 = str2.indexOf(' ');
		int lastIndexOf2 = str2.lastIndexOf(' ');
		String isim2 = str2.substring(0, indexOf2);
		String soyisim2 = str2.substring(indexOf2 + 1, lastIndexOf2);
		String yas2 = str2.substring(lastIndexOf2 + 1);

		System.out.println(isim.charAt(0) + "" + soyisim.charAt(0) + yas2);
		System.out.println(isim2.charAt(0) + "" + soyisim2.charAt(0) + yas);

	}

}
