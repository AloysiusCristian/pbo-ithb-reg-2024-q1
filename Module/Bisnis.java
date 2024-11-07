package Module;

public class Bisnis extends Tiket implements Tiket_Interface{
    boolean paketMakan;

    public Bisnis(int jarak, int bagasi, boolean paketMakan) {
        super(jarak, bagasi);
        this.paketMakan = paketMakan;
    }

    public boolean ispaketMakan() {
        return paketMakan;
    }

    public void setpaketMakan(boolean paketMakan) {
        this.paketMakan = paketMakan;
    }

    @Override
    public double hitungHarga(){
        double harga = this.getJarak() * 10000;
        if (this.getBagasi() > 5) {
            harga += this.getBagasi()*1500;
        }
        if (this.paketMakan) {
            harga += (harga * 0.1);
        }
        return harga;
    }
}
