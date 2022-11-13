package Istekler.yasornegi;

import java.io.*;
import java.util.Scanner;

public class YasOrnegi {

    public static void main(String[] args) throws IOException {
        Writer output = new FileWriter("output.csv");

        File dosya = new File("kullanicilar.csv");
        Scanner s = new Scanner(dosya);

        while (s.hasNextLine()) {
            String satir = s.nextLine();
            String[] split = satir.split(";");

            Integer yasInt = null;
            for (int i = 0; i < split.length; i++) {
                String yasStr = split[2];
                yasInt = Integer.parseInt(yasStr);
            }
            if (yasInt != null && yasInt > 25) {
                output.write(satir + "\n");
            }
        }
        output.close();
        s.close();

    }
}
