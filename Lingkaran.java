/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lingkaran {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        double diameter = 0;

        System.out.println("=====Perhitungan Lingkaran=====");

        while (!inputValid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            try {
                diameter = Double.parseDouble(scanner.nextLine());
                if (diameter > 0) {
                    inputValid = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = Math.PI * diameter;

        System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);

        scanner.close();
    }
}
