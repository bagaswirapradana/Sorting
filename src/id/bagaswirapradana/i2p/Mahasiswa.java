package id.bagaswirapradana.i2p;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Double ipk;

    public Mahasiswa(String nim, String nama, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-25s %s", nim, nama, ipk);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Double getIpk() {
        return ipk;
    }
}
