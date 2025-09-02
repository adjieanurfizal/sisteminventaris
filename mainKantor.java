public class mainKantor {
    public static void main(String[] args) {
        
        Inventaris inventaris = new Inventaris(5);

        Barang b1 = new Barang("Laptop", 10);
        Barang b2 = new Barang("Printer", 3);
        Barang b3 = new Barang("Kursi Kantor", 20);

        inventaris.tambahBarang(b1);
        inventaris.tambahBarang(b2);
        inventaris.tambahBarang(b3);

        inventaris.tampilkanBarang();

        b1.kurangiStok(2);
        b2.tambahStok(1);

        System.out.println("\nSetelah update stok:");
        inventaris.tampilkanBarang();
    }
}

