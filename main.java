import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama proyek: ");
        String namaProyek = input.nextLine();

        proyek p = new proyek(namaProyek);

        System.out.print("Masukkan jumlah developer: ");
        int jumlahDev = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlahDev; i++) {
            System.out.println("\nDeveloper ke-" + i);
            System.out.print("Masukkan nama developer: ");
            String namaDev = input.nextLine();

            developer d = new developer(namaDev);

            System.out.print("Masukkan jumlah tugas untuk " + namaDev + ": ");
            int jumlahTugas = input.nextInt();
            input.nextLine();

            for (int j = 1; j <= jumlahTugas; j++) {
                System.out.print("Judul tugas " + j + ": ");
                String judul = input.nextLine();

                System.out.print("Estimasi jam : ");
                int jam = input.nextInt();
                input.nextLine();

                tugas t = new tugas(judul, jam);

                System.out.print("Apakah tugas sudah selesai? (y/n): ");
                String selesai = input.nextLine();
                if (selesai.equalsIgnoreCase("y")) {
                    t.selesaikanTugas();
                }

                d.tambahTugas(t);
            }

            p.tambahDeveloper(d);
        }

        System.out.println();
        p.tampilkanStatusProyek();

        developer top = p.cariDeveloperPalingProduktif();
        if (top != null) {
            System.out.println("=== Developer Paling Produktif ===");
            System.out.println("Nama: " + top.nama);
            System.out.printf("Progress: %.2f%%\n", top.progress());
        }

        input.close();
    }
}
