package manajemenkantorpajak.model;

public class Pegawai {
    // Properti
    private String nama;
    private String jabatan;
    private int idPegawai;

    // Constructor
    public Pegawai(String nama, String jabatan, int idPegawai) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.idPegawai = idPegawai;
    }

    // Method untuk menampilkan informasi pegawai
    public void tampilkanInfo() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }
}
