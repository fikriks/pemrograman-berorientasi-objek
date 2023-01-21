/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.uas;

/**
 *
 * @author fikri
 */
public abstract class Tumbuhan {
    public abstract String namaTumbuhan(String nama);
    
    public void warnaTumbuhan(String warna){
        System.out.println("Warna Tumbuhan : "+warna);
    }
}
