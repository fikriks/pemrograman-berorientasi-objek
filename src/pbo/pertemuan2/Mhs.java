/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pertemuan2;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Mhs {
    private static String nim, nama, prodi;
    private static char JK;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nim = "20210810032";
        nama = "Fikri Khairul Shaleh";
        JK = 'L';
        prodi = "Teknik Informatika";
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.Mahasiswa(nim, nama, JK, prodi);
        mhs.tampil();
        mhs.kegiatan();
    }
}
