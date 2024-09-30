package manajemenkantorpajak.model;

public class WajibPajak {
    // Properti
    private String nama;
    private String npwp;
    private double pendapatanTahunan;

    // Static property untuk menghitung total wajib pajak
    private static int totalWajibPajak = 0;

    // Constructor
    public WajibPajak(String nama, String npwp, double pendapatanTahunan) {
        this.nama = nama;
        this.npwp = npwp;
        this.pendapatanTahunan = pendapatanTahunan;
        totalWajibPajak++; // Menambah total wajib pajak setiap ada objek baru
    }

    // Method untuk menampilkan informasi wajib pajak
    public void tampilkanInfo() {
        System.out.println("Nama Wajib Pajak: " + nama);
        System.out.println("NPWP: " + npwp);
        System.out.println("Pendapatan Tahunan: " + pendapatanTahunan);
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public double getPendapatanTahunan() {
        return pendapatanTahunan;
    }

    public void setPendapatanTahunan(double pendapatanTahunan) {
        this.pendapatanTahunan = pendapatanTahunan;
    }

    // Static method untuk mendapatkan total wajib pajak
    public static int getTotalWajibPajak() {
        return totalWajibPajak;
    }
}
