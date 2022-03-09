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
public class Mahasiswa {
     private String nim, nama, prodi;
    private char JK;
    
    public void Mahasiswa(String nim, String nama, char JK, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.JK = JK;
        this.prodi = prodi;
    }
    
    public void kegiatan(){
        System.out.println("Giat Belajar Untuk Meraih Kesuksesan di Masa Depan");
    }
    
    public void tampil(){
        System.out.println("NIM = "+ this.nim);
        System.out.println("Nama = "+ this.nama);
        if(this.JK == 'L'){
            System.out.println("Jenis Kelamin = Laki-Laki");
        }else{
            System.out.println("Jenis Kelamin = Perempuan");
        }
        System.out.println("Program Studi = "+ this.prodi);
    }
}
