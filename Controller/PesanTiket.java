package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import Module.*;

public class PesanTiket {
    static Scanner scan = new Scanner(System.in);

    public static double pesanTiket(){
        System.out.print("Pilih Jenis Tiket \n1. Ekonomi \n2. Bisnis \n3. First Class \nPilih: ");
        int pilihTiket = scan.nextInt();
        System.out.print("Masukkan jarak tempuh: ");
        int jarak = scan.nextInt();
        System.out.print("Masukkan berat bagasi: ");
        int berat = scan.nextInt();
        Tiket temp;
        switch (pilihTiket) {
            case 1:
                temp = pesanTiketEkonomi(jarak, berat);
                Data.listTiket.put("" + Data.code, temp);
                break;
            case 2:
                temp = pesanTiketBisnis(jarak, berat);
                Data.listTiket.put("" + Data.code, temp);
                break;
            case 3:
                temp = pesanTiketFirstClass(jarak, berat);
                Data.listTiket.put("" + Data.code, temp);
                break;
        }
        double harga = ShowTiket.showHarga("" + Data.code);
        Data.code++;
        return harga;
    }

    public static Ekonomi pesanTiketEkonomi(int jarak, int berat){
        Ekonomi tiket = new Ekonomi(jarak, berat);
        return tiket;
    }

    public static Bisnis pesanTiketBisnis(int jarak, int berat){
        System.out.print("Apakah mau pesan paket makan?(y/n): ");
        scan.next();
        String paketMakan = scan.nextLine();
        boolean pilihanMakan = false;
        if (paketMakan.equalsIgnoreCase("y")) {
            pilihanMakan = true;
        }
        Bisnis tiket = new Bisnis(jarak, berat, pilihanMakan);
        return tiket;
    }

    public static First_Class pesanTiketFirstClass(int jarak, int berat){
        System.out.print("Apakah mau asuransikan perjalanan?(y/n): ");
        scan.next();
        String asuransi = scan.nextLine();
        boolean pilihanAsuransi = false;
        if (asuransi.equalsIgnoreCase("y")) {
            pilihanAsuransi = true;
        }
        ArrayList<Makanan_Enum> listMakananDiambil = new ArrayList<Makanan_Enum>();
        while (true) {
            System.out.print("Apakah mau ambil makanan? Nasi Goreng/Mie Goreng: ");
            String makanan = scan.nextLine();
            if (makanan.equalsIgnoreCase("nasi goreng")) {
                listMakananDiambil.add(Makanan_Enum.NASI_GORENG);
            }
            else{
                listMakananDiambil.add(Makanan_Enum.MIE_GORENG);
            }
            System.out.print("Apakah ingin lanjut ambil makanan?(y/n): ");
            String lanjut = scan.nextLine();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }
        First_Class tiket = new First_Class(jarak, berat, pilihanAsuransi, listMakananDiambil);
        return tiket;
    }
}
