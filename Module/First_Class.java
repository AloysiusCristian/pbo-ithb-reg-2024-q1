package Module;

import java.util.ArrayList;

public class First_Class extends Tiket implements Tiket_Interface{
    boolean asuransi;
    ArrayList<Makanan_Enum> makananDipesan;

    public First_Class(int jarak, int bagasi, boolean asuransi, ArrayList<Makanan_Enum> makananDipesan) {
        super(jarak, bagasi);
        this.asuransi = asuransi;
        this.makananDipesan = makananDipesan;
    }

    public boolean isAsuransi() {
        return asuransi;
    }
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }
    public ArrayList<Makanan_Enum> getMakananDipesan() {
        return makananDipesan;
    }
    public void setMakananDipesan(ArrayList<Makanan_Enum> makananDipesan) {
        this.makananDipesan = makananDipesan;
    }

    @Override
    public double hitungHarga(){
        double harga = this.getJarak() * 15000;
        if (this.asuransi) {
            harga += (harga * 0.1);
        }
        return harga;
    }
}
