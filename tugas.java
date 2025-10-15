public class tugas {
    String judul;
    boolean status;
    int estimasiJam;

    public tugas(String judul, int estimasiJam) {
        this.judul = judul;
        this.estimasiJam = estimasiJam;
        this.status = false;
    }

    public void selesaikanTugas() {
        status = true;
    }
}
