package View;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void menu(){
        System.out.print("1. Pesan Tiket \nPilih: ");
        int pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                PrintHarga.printHargaHabisPesan();
                break;
            default:
                System.out.println("Tidak ada pilihan itu!");
                break;
        }
    }
}
