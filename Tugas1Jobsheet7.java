import java.util.Scanner;
public class Tugas1Jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket = 0, totalTiket = 0, harga = 50000;
        double totalHarga = 0;
        do {
            System.out.print("Masukkan tiket terjual(0 untuk berhenti): ");
            tiket = sc.nextInt();
            if (tiket < 0) {
                continue;
            } 
            totalTiket += tiket;
            if (tiket > 0 && tiket <= 4) {
            totalHarga += harga * tiket;
            } else if (tiket > 4 && tiket <= 10) {
                totalHarga += harga * tiket * 0.9;
            } else if (tiket > 10) {
                totalHarga += harga * tiket * 0.85;
            }
        } while (tiket != 0);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan: " + totalHarga);
        sc.close();
    }
}