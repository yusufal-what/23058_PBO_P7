import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Data barang
        String[][] barang = {
            {"a001", "Buku", "3000"},
            {"a002", "Pensil", "4000"},
            {"a003", "Pulpen", "5000"}
        };

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();

        String[] kodeBarang = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBarang[i] = input.next();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
        }

        // Tampilkan hasil
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("==========================================");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("==========================================");

        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < barang.length; j++) {
                if (kodeBarang[i].equalsIgnoreCase(barang[j][0])) {
                    int harga = Integer.parseInt(barang[j][2]);
                    int jumlahBayar = harga * jumlahBeli[i];
                    totalBayar += jumlahBayar;
                    
                    System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\t\t%d\n", 
                        (i + 1), barang[j][0], barang[j][1], harga, jumlahBeli[i], jumlahBayar);
                }
            }
        }
        System.out.println("==========================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
    }
}