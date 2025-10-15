import java.util.ArrayList;
import java.util.List;

public class developer {
    String nama;
    List<tugas> daftarTugas = new ArrayList<>();

    public developer(String nama) {
        this.nama = nama;
    }

    public void tambahTugas(tugas t) {
        daftarTugas.add(t);
    }

    public int hitungTotalJam() {
        int total = 0;
        for (tugas t : daftarTugas) {
            total += t.estimasiJam;
        }
        return total;
    }

    public double progress() {
        if (daftarTugas.isEmpty()) return 0;
        int selesai = 0;
        for (tugas t : daftarTugas) {
            if (t.status) selesai++;
        }
        return (selesai * 100.0) / daftarTugas.size();
    }
}
