import java.util.Scanner;
import java.math.BigInteger;

public class DataType {
    public static void main(String[] args) {
        // input baca
        Scanner pembaca = new Scanner(System.in);
        
        // baca jumlah kasus uji
        int jumlahKasusUji = pembaca.nextInt();
        
        // Loop untuk setiap kasus uji
        for (int indeks = 0; indeks < jumlahKasusUji; indeks++) {
            // Membaca n sebagai string, lalu konversi ke BigInteger karena n bisa sangat besar
            String nString = pembaca.next();
            BigInteger bilangan = new BigInteger(nString);
            
            // Mengecek apakah bilangan bisa disimpan dalam short, int, atau long
            boolean dapatDisimpanDiShort = bilangan.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && 
                                           bilangan.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0;
            boolean dapatDisimpanDiInt = bilangan.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && 
                                         bilangan.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0;
            boolean dapatDisimpanDiLong = bilangan.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && 
                                          bilangan.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0;
            
            // Jika bilangan bisa disimpan dalam salah satu tipe data, cetak pesan dan tipe data yang sesuai
            if (dapatDisimpanDiShort || dapatDisimpanDiInt || dapatDisimpanDiLong) {
                System.out.println(nString + " can be fitted in:");
                if (dapatDisimpanDiShort) {
                    System.out.println("* short");
                }
                if (dapatDisimpanDiInt) {
                    System.out.println("* int");
                }
                if (dapatDisimpanDiLong) {
                    System.out.println("* long");
                }
            } else {
                // Jika bilangan tidak bisa disimpan dalam tipe data mana pun, cetak pesan ini
                System.out.println(nString + " can't be fitted anywhere.");
            }
        }
        
        // Menutup Scanner
        pembaca.close();
    }
}