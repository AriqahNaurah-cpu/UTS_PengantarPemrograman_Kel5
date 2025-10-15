import java.util.ArrayList;
import java.util.List;

public class proyek {
    String namaProyek;
    List<developer> tim = new ArrayList<>();

    public proyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public void tambahDeveloper(developer d) {
        tim.add(d);
    }

    public void tampilkanStatusProyek() {
        System.out.println("=== STATUS PROYEK: " + namaProyek + " ===");  // Tambahan sesuai permintaan Ira
        for (developer d : tim) {
            System.out.println("Developer: " + d.nama);
            System.out.println("Total Jam: " + d.hitungTotalJam());
            System.out.printf("Progress: %.2f%%\n", d.progress());
            System.out.println("-----------------------------");
        }
    }

    public developer cariDeveloperPalingProduktif() {
        if (tim.isEmpty()) return null;
        developer produktif = tim.get(0);
        for (developer d : tim) {
            if (d.progress() > produktif.progress()) {
                produktif = d;
            }
        }
        return produktif;
    }
}
