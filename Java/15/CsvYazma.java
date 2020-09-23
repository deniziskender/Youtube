package youtube15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CsvYazma {

	public static void main(String[] args) throws IOException {
		Writer r = new FileWriter("yazilandosya.csv");
		r.write("11;22;33\n");
		r.close();
	}

}
