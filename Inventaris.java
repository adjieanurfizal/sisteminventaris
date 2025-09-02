public class Inventaris {
    private Barang[] daftarBarang;
    private int jumlahBarang; 
    
    public Inventaris(int kapasitas) {
        daftarBarang = new Barang[kapasitas];
        jumlahBarang = 0;
    }

    public void tambahBarang(Barang barang) {
        if (jumlahBarang < daftarBarang.length) {
            daftarBarang[jumlahBarang] = barang;
            jumlahBarang++;
        } else {
            System.out.println("Kapasitas penuh! Tidak bisa tambah barang.");
        }
    }

    public void tampilkanBarang() {
        System.out.println("Daftar Barang di Inventaris:");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("- " + daftarBarang[i].getNamaBarang() + " (Stok: " + daftarBarang[i].getStok() + ")");
        }
    }
}


