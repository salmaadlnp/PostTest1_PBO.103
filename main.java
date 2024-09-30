package manajemenkantorpajak.main;

import manajemenkantorpajak.model.Pegawai;
import manajemenkantorpajak.model.WajibPajak;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList untuk menyimpan data pegawai dan wajib pajak
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        ArrayList<WajibPajak> daftarWajibPajak = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Manajemen Kantor Pajak ===");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Tampilkan Semua Pegawai");
            System.out.println("3. Tambah Wajib Pajak");
            System.out.println("4. Tampilkan Semua Wajib Pajak");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Tambah pegawai
                    System.out.print("Masukkan Nama Pegawai: ");
                    String namaPegawai = scanner.next();
                    System.out.print("Masukkan Jabatan Pegawai: ");
                    String jabatanPegawai = scanner.next();
                    System.out.print("Masukkan ID Pegawai: ");
                    int idPegawai = scanner.nextInt();
                    daftarPegawai.add(new Pegawai(namaPegawai, jabatanPegawai, idPegawai));
                    System.out.println("Pegawai berhasil ditambahkan!\n");
                    break;

                case 2:
                    // Tampilkan semua pegawai
                    System.out.println("=== Daftar Pegawai ===");
                    for (Pegawai pegawai : daftarPegawai) {
                        pegawai.tampilkanInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 3:
                    // Tambah wajib pajak
                    System.out.print("Masukkan Nama Wajib Pajak: ");
                    String namaWajibPajak = scanner.next();
                    System.out.print("Masukkan NPWP: ");
                    String npwp = scanner.next();
                    System.out.print("Masukkan Pendapatan Tahunan: ");
                    double pendapatanTahunan = scanner.nextDouble();
                    daftarWajibPajak.add(new WajibPajak(namaWajibPajak, npwp, pendapatanTahunan));
                    System.out.println("Wajib Pajak berhasil ditambahkan!\n");
                    break;

                case 4:
                    // Tampilkan semua wajib pajak
                    System.out.println("=== Daftar Wajib Pajak ===");
                    for (WajibPajak wajibPajak : daftarWajibPajak) {
                        wajibPajak.tampilkanInfo();
                        System.out.println("-------------------");
                    }
                    System.out.println("Total Wajib Pajak: " + WajibPajak.getTotalWajibPajak());
                    break;

                case 5:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
