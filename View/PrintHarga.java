package View;

import Controller.*;

public class PrintHarga {
    public static void printHargaHabisPesan(){
        double harga = PesanTiket.pesanTiket();
        System.out.println("Harga Tiket yang dibeli: " + harga);
    }
}
