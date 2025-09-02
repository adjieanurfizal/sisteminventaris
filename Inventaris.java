import java.util.ArrayList;

public class Inventaris {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
        System.out.println("Barang berhasil ditambahkan!");
    }

    public void lihatBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada barang dalam inventaris.");
        } else {
            System.out.println("=== Daftar Barang ===");
            for (Barang b : daftarBarang) {
                System.out.println(b);
            }
        }
    }

    public Barang cariBarang(String kode) {
        for (Barang b : daftarBarang) {
            if (b.getKodeBarang().equalsIgnoreCase(kode)) {
                return b;
            }
        }
        return null;
    }

    public void updateStok(String kode, int jumlahBaru) {
        Barang b = cariBarang(kode);
        if (b != null) {
            b.setJumlahStok(jumlahBaru);
            System.out.println("Stok barang berhasil diperbarui.");
        } else {
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
        }
    }

    public void hapusBarang(String kode) {
        Barang b = cariBarang(kode);
        if (b != null) {
            daftarBarang.remove(b);
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
        }
    }
}
