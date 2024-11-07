package Module;

public class Ekonomi extends Tiket implements Tiket_Interface{
    public Ekonomi(int jarak, int bagasi) {
        super(jarak, bagasi);
    }

    @Override
    public double hitungHarga(){
        double harga = this.getJarak() * 7500;
        if (this.getBagasi() > 5) {
            harga += this.getBagasi()*1500;
        }
        harga += 5000;
        return harga;
    }
}
