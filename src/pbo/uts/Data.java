/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uts;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Data {
    public static void main(String args[]){
        Prodi data_prodi_1 = new Prodi("1", "FKOM", "08", "Teknik Informatika", "B");
        data_prodi_1.tampil_data();
        
        System.out.println("");
        
        Prodi data_prodi_2 = new Prodi("1", "FKOM", "09", "Sistem Informasi", "B");
        data_prodi_2.tampil_data();
    }
}
