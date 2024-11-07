package Controller;

import Module.*;

public class ShowTiket {
    public static double showHarga(String code){
        Tiket tiket = Data.getListTiket().get(code);
        double harga = 0;
        if (tiket instanceof Ekonomi) {
            harga = ((Ekonomi)tiket).hitungHarga();
        }
        else if(tiket instanceof Bisnis){
            harga = ((Bisnis)tiket).hitungHarga();
        }
        else{
            harga = ((First_Class)tiket).hitungHarga();
        }
        return harga;
    }
}
