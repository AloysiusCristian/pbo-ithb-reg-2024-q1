package Module;

public abstract class Tiket {
    private int jarak, bagasi;

    public Tiket(int jarak, int bagasi) {
        this.jarak = jarak;
        this.bagasi = bagasi;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public int getBagasi() {
        return bagasi;
    }

    public void setBagasi(int bagasi) {
        this.bagasi = bagasi;
    }
}
