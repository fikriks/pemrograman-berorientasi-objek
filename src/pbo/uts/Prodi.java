/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Prodi extends Fakultas {
    public String kode_prodi, nama_prodi, akreditasi_prodi;
    
    public Prodi(String kode_fakultas, String nama_fakultas, String kode_prodi, String nama_prodi, String akreditasi_prodi) {
        super(kode_prodi, nama_prodi);
        this.kode_prodi = kode_prodi;
        this.nama_prodi = nama_prodi;
        this.akreditasi_prodi = akreditasi_prodi;
    }
    
    public String getKodeProdi() {
        return kode_prodi;
    }
    
    public String getNamaProdi() {
        return nama_prodi;
    }
    
    public String getAkreditasiProdi() {
        return akreditasi_prodi;
    }
    
    public void kerja() {
        System.out.println("Penyelenggara teknis kegiatan KBM di lingkungan program studi");
    }
    
    public void tampil_data() {
        super.tampil_data();
        super.kerja();
        System.out.println("Kode Program Studi : "+ this.getKodeProdi());
        System.out.println("Nama Program Studi : "+ this.getNamaProdi());
        System.out.println("Akreditasi Program Studi : "+ this.getAkreditasiProdi());
        this.kerja();
    }
}
