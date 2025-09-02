public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int jumlahStok;
    private String lokasi;

    public Barang(String kodeBarang, String namaBarang, int jumlahStok, String lokasi) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jumlahStok = jumlahStok;
        this.lokasi = lokasi;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String toString() {
        return "Kode: " + kodeBarang + ", Nama: " + namaBarang +
                ", Stok: " + jumlahStok + ", Lokasi: " + lokasi;
    }
}
