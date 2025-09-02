import java.util.Scanner;

public class mainKantor {
    public static void main(String[] args) {
        Inventaris inv = new Inventaris();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM INVENTARIS BARANG KANTOR ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Semua Barang");
            System.out.println("3. Cari Barang");
            System.out.println("4. Update Stok Barang");
            System.out.println("5. Hapus Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jumlah stok: ");
                    int stok = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan lokasi: ");
                    String lokasi = sc.nextLine();
                    Barang b = new Barang(kode, nama, stok, lokasi);
                    inv.tambahBarang(b);
                    break;

                case 2:
                    inv.lihatBarang();
                    break;

                case 3:
                    System.out.print("Masukkan kode barang yang dicari: ");
                    String kodeCari = sc.nextLine();
                    Barang hasil = inv.cariBarang(kodeCari);
                    if (hasil != null) {
                        System.out.println("Barang ditemukan: " + hasil);
                    } else {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan kode barang: ");
                    String kodeUpdate = sc.nextLine();
                    System.out.print("Masukkan stok baru: ");
                    int stokBaru = sc.nextInt();
                    inv.updateStok(kodeUpdate, stokBaru);
                    break;

                case 5:
                    System.out.print("Masukkan kode barang: ");
                    String kodeHapus = sc.nextLine();
                    inv.hapusBarang(kodeHapus);
                    break;

                case 0:
                    System.out.println("Terima kasih! Keluar dari sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
