/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uas;

import java.util.Scanner;

/**
 *
 * @author fikri
 */
class TumbuhanHewan extends Tumbuhan implements Hewan{
    @Override
    public String namaTumbuhan(String nama){
        return nama;
    }
    
    @Override
    public String namaHewan(String nama){
        return nama;
    }
    
    @Override
    public String jenisHewan(String jenis){
        return jenis;
    }
    
    @Override
    public String warnaHewan(String warna){
        return warna;
    }
}

public class UAS {
    public static void main(String[] args) {
        String[] namaTmbh = new String[3]; 
        String[] warnaTmbh = new String[3];
        String[] namaHwn = new String[3]; 
        String[] warnaHwn = new String[3];
        
        TumbuhanHewan tumbuhanHewan = new TumbuhanHewan();
        
         Scanner scanner = new Scanner(System.in);
        
        for(int i = 1; i < 3;i++){
            System.out.println("Masukkan Data Ke-"+i);
            System.out.print("Masukan Nama Tumbuhan : ");
            namaTmbh[i] = scanner.nextLine();
            System.out.print("Masukan Warna Tumbuhan : ");
            warnaTmbh[i] = scanner.nextLine();
            System.out.print("Masukan Nama Hewan : ");
            namaHwn[i] = scanner.nextLine();
            System.out.print("Masukan Warna Hewan : ");
            warnaHwn[i] = scanner.nextLine();
        }
        
        System.out.println("");
       
        for(int i = 1; i < 3;i++){
            System.out.println("Data Ke"+i);
            System.out.println("Nama Tumbuhan : "+tumbuhanHewan.namaTumbuhan(namaTmbh[i]));
            tumbuhanHewan.warnaTumbuhan(warnaTmbh[i]);
            System.out.println("Nama Hewan : "+tumbuhanHewan.namaHewan(namaHwn[i]));
            System.out.println("Warna Hewan : "+tumbuhanHewan.warnaHewan(warnaHwn[i]));
        }
    }
}
