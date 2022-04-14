/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Fakultas {
    public String kode_fakultas, nama_fakultas;
    
    public Fakultas(String kode_fakultas, String nama_fakultas) {
         this.kode_fakultas = kode_fakultas;
         this.nama_fakultas = nama_fakultas;
    }
    
    public String getKodeFakultas() {
        return kode_fakultas;
    }
    
    public String getNamaFakultas() {
        return nama_fakultas;
    }
    
    public void kerja() {
        System.out.println("Memonitoring penyelenggaraan kegiatan program studi");
    }
    
    public void tampil_data() {
        System.out.println("Kode Fakultas : "+ this.getKodeFakultas());
        System.out.println("Nama Fakultas : "+ this.getNamaFakultas());
    }
}
